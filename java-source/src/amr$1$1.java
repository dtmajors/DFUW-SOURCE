import java.io.File;
import java.io.FileFilter;

class amr$1$1 implements FileFilter {
   amr$1$1(amr$1 var1) {
      this.bAC = var1;
   }

   @Override
   public boolean accept(File var1) {
      return var1.getName().startsWith("inv_");
   }
}
