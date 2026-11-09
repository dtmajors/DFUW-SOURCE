import java.io.File;
import java.io.FilenameFilter;

class mrv$4 implements FilenameFilter {
   mrv$4(mrv var1, File var2) {
      this.Eoi = var1;
      this.Eoj = var2;
   }

   @Override
   public boolean accept(File var1, String var2) {
      return var1.equals(this.Eoj) && var2.contains("_spawns_") && var2.endsWith("xml");
   }
}
