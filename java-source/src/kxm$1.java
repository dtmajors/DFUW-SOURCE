import java.io.File;
import java.io.FileFilter;

class kxm$1 implements FileFilter {
   kxm$1(kxm var1) {
      this.qgH = var1;
   }

   @Override
   public boolean accept(File var1) {
      String var2 = var1.getName().toLowerCase();
      return var2.startsWith("r_") && var2.endsWith(".xml");
   }
}
