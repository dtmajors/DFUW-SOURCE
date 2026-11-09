import java.io.File;
import javax.swing.filechooser.FileFilter;

class mpn$1 extends FileFilter {
   mpn$1(mpn var1) {
      this.DVI = var1;
   }

   @Override
   public boolean accept(File var1) {
      if (var1.isDirectory()) {
         return true;
      }

      String var2 = var1.getName().toLowerCase();
      return var2.endsWith(".xml") || var2.endsWith(".xlk");
   }

   @Override
   public String getDescription() {
      return "XML Files or xml link files (*.xml;*.xlk)";
   }
}
