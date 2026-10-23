package dev.lymeowz.build;

import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * Safe link-only smoke test of the actual rebuilt client JAR.
 *
 * Loading main.GameMidlet with initialize=false does not call its constructor,
 * <clinit>, startApp, login, resource downloader or networking.
 */
public final class ClientLinkSmokeTest {
    private ClientLinkSmokeTest() {}

    public static void main(String[] args) throws Exception {
        if (args.length != 4) {
            throw new IllegalArgumentException(
                "Usage: ClientLinkSmokeTest client.jar cldcapi11.jar midpapi20.jar expected-hook-text");
        }
        URL[] classpath = new URL[] {
            new File(args[0]).toURI().toURL(),
            new File(args[1]).toURI().toURL(),
            new File(args[2]).toURI().toURL()
        };
        try (URLClassLoader loader = new URLClassLoader(classpath, null)) {
            Class<?> midlet = Class.forName("main.GameMidlet", false, loader);
            Method startup = midlet.getDeclaredMethod("startApp");
            if (startup.getParameterCount() != 0 || startup.getReturnType() != void.class) {
                throw new AssertionError("MIDlet startup method signature changed");
            }
            // Link representative original network/data components without
            // instantiating them or opening any connection.
            String[] components = {
                "IOo_",               // packet stream reader and writer
                "IO0",                // incoming command router
                "IO1O",               // socket wrapper
                "I1I1",               // game command handling
                "nrolite.DataDownloader"
            };
            for (String component : components) {
                Class<?> linked = Class.forName(component, false, loader);
                if (linked.getClassLoader() != loader) {
                    throw new AssertionError("Unexpected class source for " + component);
                }
            }

            // Read archive resources without triggering the game's loader.
            try (java.io.InputStream manifest =
                     loader.getResourceAsStream("META-INF/MANIFEST.MF")) {
                if (manifest == null || manifest.read() < 0) {
                    throw new AssertionError("Missing or empty MIDlet manifest");
                }
            }
            try (java.io.InputStream icon = loader.getResourceAsStream("icon.png")) {
                if (icon == null || icon.read() < 0) {
                    throw new AssertionError("Missing or empty client icon");
                }
            }

            Class<?> hook = Class.forName("dev.lymeowz.client.BuildHook", false, loader);
            if (hook.getClassLoader() != loader) {
                throw new AssertionError("BuildHook did not come from rebuilt JAR");
            }
            Method announce = hook.getDeclaredMethod("announce");
            if (announce.getParameterCount() != 0) {
                throw new AssertionError("Hook signature changed");
            }
            // Only execute our isolated, side-effect-limited extension class.
            // Original GameMidlet.startApp() is NEVER invoked here.
            java.io.PrintStream original = System.out;
            java.io.ByteArrayOutputStream captured = new java.io.ByteArrayOutputStream();
            try {
                System.setOut(new java.io.PrintStream(captured, true, "UTF-8"));
                announce.invoke(null);
            } finally {
                System.setOut(original);
            }
            String expected = args[3];
            String message = captured.toString("UTF-8").trim();
            if (!expected.equals(message)) {
                throw new AssertionError("Unexpected BuildHook output");
            }
            System.out.println("PASS: actual client MIDlet and five network/data classes linked without initialization");
            System.out.println("PASS: JAR manifest and icon readable");
            System.out.println("PASS: extension class loaded and ran from rebuilt client JAR");
            System.out.println("NOTE: GameMidlet.startApp() was NOT executed; gameplay is untested");
        }
    }
}
