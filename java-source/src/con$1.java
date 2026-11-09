import java.io.File;
import java.io.FileFilter;

class con$1 implements FileFilter {
   con$1(con var1) {
      this.EWS = var1;
   }

   @Override
   public boolean accept(File var1) {
      String var2 = var1.getName();
      return var1.isDirectory() && !var2.startsWith(".") && (this.EWS.eTP() == null || this.El(var2));
   }

   private boolean El(String var1) {
      for (String var3 : this.EWS.eTP()) {
         if (var1.startsWith(var3)) {
            return true;
         }
      }

      return false;
   }
}
