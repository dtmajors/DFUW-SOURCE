import java.io.File;
import java.io.FileFilter;

class con$2 implements FileFilter {
   con$2(con var1) {
      this.EWS = var1;
   }

   @Override
   public boolean accept(File var1) {
      return var1.isDirectory() && var1.getName().startsWith("dungeon");
   }
}
