import java.awt.Insets;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;

class s$7 implements DropTargetListener {
   s$7(s var1) {
      this.cS = var1;
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
            if (s.f(this.cS) != null) {
               Insets var5 = s.a(this.cS).getInsets();
               s.f(this.cS).a(var4, var1.getLocation().x - var5.left, var1.getLocation().y - var5.top);
               var1.dropComplete(true);
            }
         }
      } catch (Exception var6) {
      }
   }

   @Override
   public void dropActionChanged(DropTargetDragEvent var1) {
   }
}
