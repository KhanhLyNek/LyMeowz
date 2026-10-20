import java.nio.file.*;
import jdk.internal.org.objectweb.asm.*;
import jdk.internal.org.objectweb.asm.commons.*;
public class ConvertCLDC {
 public static void main(String[] a)throws Exception{
  final Path in=Paths.get(a[0]),out=Paths.get(a[1]);
  Files.walk(in).filter(p->p.toString().endsWith(".class")&&p.toString().contains("/game/")).forEach(p->{
   try{
    ClassReader cr=new ClassReader(Files.readAllBytes(p));
    ClassWriter cw=new ClassWriter(ClassWriter.COMPUTE_FRAMES|ClassWriter.COMPUTE_MAXS){
     protected String getCommonSuperClass(String x,String y){return "java/lang/Object";}
    };
    ClassVisitor cv=new ClassRemapper(new ClassVisitor(Opcodes.ASM8,cw){
     public void visit(int version,int access,String name,String signature,String parent,String[] interfaces){
      super.visit(Opcodes.V1_1,access,name,signature,parent,interfaces);
     }
    },new SimpleRemapper("java/lang/StringBuilder","java/lang/StringBuffer"));
    cr.accept(cv,ClassReader.EXPAND_FRAMES);
    byte[] b=cw.toByteArray();Path dest=out.resolve(in.relativize(p));Files.createDirectories(dest.getParent());Files.write(dest,b);
    System.out.println(dest+" version="+((b[6]&255)*256+(b[7]&255)));
   }catch(Exception ex){throw new RuntimeException(p.toString(),ex);}
  });
 }
}
