package dev.lymeowz.build;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

/**
 * Inserts a single, side-effect-limited startup call into the existing
 * compiled MIDlet, preserving all other classes in the original archive.
 *
 * IMPORTANT: This patcher never loads/executes game bytecode or contacts
 * the game's server.
 */
public final class PatchMidlet {
    private static final String MIDLET = "main/GameMidlet";
    private static final String HOOK = "dev/lymeowz/client/BuildHook";
    private static final String METHOD = "startApp";

    private PatchMidlet() {
    }

    private static int countHookCalls(byte[] code) {
        final AtomicInteger calls = new AtomicInteger();
        new ClassReader(code).accept(new ClassVisitor(Opcodes.ASM9) {
            @Override
            public MethodVisitor visitMethod(int access, String name, String descriptor,
                                             String signature, String[] exceptions) {
                if (!METHOD.equals(name) || !"()V".equals(descriptor)) {
                    return null;
                }
                return new MethodVisitor(Opcodes.ASM9) {
                    @Override
                    public void visitMethodInsn(int opcode, String owner, String method,
                                                String desc, boolean isInterface) {
                        if (opcode == Opcodes.INVOKESTATIC && HOOK.equals(owner)
                                && "announce".equals(method) && "()V".equals(desc)) {
                            calls.incrementAndGet();
                        }
                    }
                };
            }
        }, ClassReader.SKIP_FRAMES | ClassReader.SKIP_DEBUG);
        return calls.get();
    }

    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            throw new IllegalArgumentException("Usage: PatchMidlet original.jar patched-GameMidlet.class");
        }
        byte[] original;
        try (JarFile jar = new JarFile(new File(args[0]))) {
            JarEntry entry = jar.getJarEntry(MIDLET + ".class");
            if (entry == null) {
                throw new IOException("Original MIDlet class is missing");
            }
            try (java.io.InputStream input = jar.getInputStream(entry)) {
                java.io.ByteArrayOutputStream output = new java.io.ByteArrayOutputStream();
                byte[] buffer = new byte[8192];
                int n;
                while ((n = input.read(buffer)) != -1) {
                    output.write(buffer, 0, n);
                }
                original = output.toByteArray();
            }
        }

        ClassReader reader = new ClassReader(original);
        if (!MIDLET.equals(reader.getClassName())) {
            throw new IOException("Unexpected class identity: " + reader.getClassName());
        }
        if (countHookCalls(original) != 0) {
            throw new IOException("Refusing to patch an already instrumented class");
        }

        ClassWriter writer = new ClassWriter(0);
        final AtomicInteger matched = new AtomicInteger();
        ClassVisitor visitor = new ClassVisitor(Opcodes.ASM9, writer) {
            @Override
            public MethodVisitor visitMethod(int access, String name, String descriptor,
                                             String signature, String[] exceptions) {
                MethodVisitor mv = super.visitMethod(access, name, descriptor, signature, exceptions);
                if (!METHOD.equals(name) || !"()V".equals(descriptor)) {
                    return mv;
                }
                matched.incrementAndGet();
                return new MethodVisitor(Opcodes.ASM9, mv) {
                    @Override
                    public void visitCode() {
                        super.visitCode();
                        super.visitMethodInsn(Opcodes.INVOKESTATIC, HOOK, "announce", "()V", false);
                    }
                };
            }
        };
        // Do not recompute frames or rename any NRO game symbols.
        reader.accept(visitor, 0);
        if (matched.get() != 1) {
            throw new IOException("Expected exactly one startApp()V; found " + matched.get());
        }
        byte[] patched = writer.toByteArray();
        if (countHookCalls(patched) != 1) {
            throw new IOException("Patch validation failed; expected exactly one startup hook");
        }
        if (patched.length < 8 || original.length < 8
                || patched[6] != original[6] || patched[7] != original[7]) {
            throw new IOException("Patched Java class version changed unexpectedly");
        }
        Files.write(new File(args[1]).toPath(), patched);
        System.out.println("Verified exactly one startup hook in main.GameMidlet.startApp()");
    }
}
