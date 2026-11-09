import java.awt.Component;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class mtq$b extends MouseAdapter {
   mtq$b(mtq var1) {
      this.EBi = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      lfn.b(0, this.getClass().getName(), "mousePressed() : MousePressed");
      if (var1.getModifiers() == 4) {
         mtq.n(this.EBi).show(var1.getComponent(), var1.getX(), var1.getY());
         Component var2 = (Component)var1.getSource();
         if (var2.equals(mtq.k(this.EBi))) {
            int var3 = mtq.k(this.EBi).rowAtPoint(new Point(var1.getX(), var1.getY()));
            int var4 = mtq.k(this.EBi).getSelectedRowCount();
            if (var4 == 0) {
               mtq.k(this.EBi).setRowSelectionInterval(var3, var3);
            }
         }
      } else if (var1.getModifiers() == 16 && var1.getClickCount() == 2 && var1.getComponent().equals(mtq.k(this.EBi))) {
         int var5 = mtq.k(this.EBi).getSelectedRow();
         if (var5 != -1) {
         }
      }
   }
}
