import java.io.File;
import java.io.FileFilter;

class mwv$a implements FileFilter {
   mwv$a(mwv var1) {
      this.ERS = var1;
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
