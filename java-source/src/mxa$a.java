import java.io.File;
import java.io.FileFilter;

class mxa$a implements FileFilter {
   mxa$a(mxa var1) {
      this.ERU = var1;
   }

   @Override
   public boolean accept(File var1) {
      return var1.isDirectory() && !var1.getName().toLowerCase().contains("svn")
         || var1.getName().toLowerCase().endsWith(".xml") && var1.getName().toLowerCase().contains("quest_targets");
   }

   public String getDescription() {
      return "Xml files.";
   }
}
