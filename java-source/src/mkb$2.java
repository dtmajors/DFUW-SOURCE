import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;
import java.io.File;

class mkb$2 implements DropTargetListener {
   mkb$2(mkb var1) {
      this.DEO = var1;
   }

   @Override
   public void dragEnter(DropTargetDragEvent var1) {
   }

   @Override
   public void dragExit(DropTargetEvent var1) {
   }

   @Override
   public void dragOver(DropTargetDragEvent var1) {
   }

   @Override
   public void drop(DropTargetDropEvent var1) {
      Transferable var2 = var1.getTransferable();

      try {
         Object var3 = var1.getTransferable().getTransferData(DataFlavor.stringFlavor);
         if (var3 != null && var3 instanceof String) {
            String var4 = (String)var3;
            String[] var5 = var4.split("\n");

            for (int var6 = 0; var6 < var5.length; var6++) {
               String var7 = var5[var6];
               File var8 = new File(var7);
               String var9 = var8.getName().toLowerCase();
               if (!var9.contains(".xml")) {
                  return;
               }

               String var10 = var8.getParent().toLowerCase();
               String var11 = this.DEO.eDd().toString().toLowerCase();
               if (var10.equals(var11)) {
                  return;
               }

               var9 = var9.replace(".xml", ".xlk");
               String var12 = this.DEO.eDd() + "\\" + var9;
               jrw var13 = new jrw(var12);
               jry.a(var13, var7);
            }

            this.DEO.updateUI();
         }
      } catch (Exception var14) {
      }
   }

   @Override
   public void dropActionChanged(DropTargetDragEvent var1) {
   }
}
