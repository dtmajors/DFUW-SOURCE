import java.io.File;
import java.io.FileFilter;

class mzt$1 implements FileFilter {
   mzt$1(mzt var1) {
      this.EVm = var1;
   }

   @Override
   public boolean accept(File var1) {
      if (var1.isFile() && !var1.getName().endsWith(".xml")) {
         return false;
      }

      String var2 = var1.getParentFile().getName();
      return !var2.equals("audio") && !var2.equals("shader") && !var2.equals("detailtexture");
   }
}
