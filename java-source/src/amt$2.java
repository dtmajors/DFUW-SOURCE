import java.io.File;
import java.io.FileFilter;

final class amt$2 implements FileFilter {
   amt$2(String var1) {
      this.bAP = var1;
   }

   @Override
   public boolean accept(File var1) {
      return var1.getName().toLowerCase().contains(this.bAP);
   }
}
