import java.io.File;
import java.io.FilenameFilter;

final class jvj$1 implements FilenameFilter {
   @Override
   public boolean accept(File var1, String var2) {
      return var2.contains(".xml");
   }
}
