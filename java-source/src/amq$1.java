import java.io.File;
import java.io.FileFilter;

final class amq$1 implements FileFilter {
   @Override
   public boolean accept(File var1) {
      return var1.getName().startsWith("inv_");
   }
}
