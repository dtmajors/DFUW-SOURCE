import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.TransferHandler;
import javax.swing.TransferHandler.TransferSupport;

class msc$a extends TransferHandler {
   private DefaultListModel EpQ;

   public msc$a(msc var1, DefaultListModel var2) {
      this.EpP = var1;
      this.EpQ = var2;
   }

   @Override
   public boolean canImport(TransferSupport var1) {
      return !var1.isDrop() ? false : var1.isDataFlavorSupported(DataFlavor.stringFlavor);
   }

   @Override
   public boolean importData(TransferSupport var1) {
      if (!this.canImport(var1)) {
         return false;
      }

      Transferable var2 = var1.getTransferable();

      String var3;
      try {
         var3 = (String)var2.getTransferData(DataFlavor.stringFlavor);
      } catch (Exception var11) {
         return false;
      }

      JList.DropLocation var4 = (JList.DropLocation)var1.getDropLocation();
      int var5 = var4.getIndex();
      String[] var6 = var3.split(",");

      for (String var10 : var6) {
         if (!var10.isEmpty()) {
            var10 = new jrw(var10).getName();
            this.EpQ.add(var5++, var10.trim());
         }
      }

      return true;
   }
}
