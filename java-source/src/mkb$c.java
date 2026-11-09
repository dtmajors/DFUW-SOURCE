import java.io.File;
import javax.swing.filechooser.FileSystemView;

public class mkb$c extends FileSystemView {
   private jrw DFd;
   private jrw[] DFe;

   public mkb$c(mkb var1) {
      this.DEO = var1;
      this.DFd = null;
      this.DFe = null;
   }

   public jrw[] f(jrw var1, boolean var2) {
      if (this.DFd != null && this.DFe != null && var1.equals(this.DFd)) {
         return this.DFe;
      }

      this.DFd = var1;
      this.DFe = var1.dRT();
      return this.DFe;
   }

   public boolean O(jrw var1) {
      return getFileSystemView().isRoot(var1);
   }

   @Override
   public File createNewFolder(File var1) {
      return getFileSystemView().createNewFolder(var1);
   }

   public boolean P(jrw var1) {
      return getFileSystemView().isHiddenFile(var1);
   }

   @Override
   public File[] getRoots() {
      return getFileSystemView().getRoots();
   }
}
