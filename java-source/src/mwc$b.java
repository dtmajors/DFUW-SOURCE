import java.awt.Component;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class mwc$b extends MouseAdapter {
   mwc$b(mwc var1) {
      this.EOU = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      if (var1.getModifiers() == 4) {
         mwc.d(this.EOU).show(var1.getComponent(), var1.getX(), var1.getY());
         Component var2 = (Component)var1.getSource();
         if (var2.equals(mwc.c(this.EOU))) {
            int var3 = mwc.c(this.EOU).rowAtPoint(new Point(var1.getX(), var1.getY()));
            int var4 = mwc.c(this.EOU).getSelectedRowCount();
            if (var4 == 0) {
               mwc.c(this.EOU).setRowSelectionInterval(var3, var3);
            }
         } else {
            lfn.b(4, this.getClass().getName(), "Selected popup area is not over a JTable");
         }
      } else if (var1.getModifiers() == 16 && var1.getClickCount() == 2) {
         Component var5 = (Component)var1.getSource();
         if (var5.equals(mwc.c(this.EOU))) {
            int var6 = mwc.c(this.EOU).rowAtPoint(new Point(var1.getX(), var1.getY()));
            mwc.a(this.EOU, ((mwe)mwc.c(this.EOU).getModel()).afO(var6));
         } else {
            lfn.b(4, this.getClass().getName(), "Selected popup area is not over a JTable");
         }
      }
   }
}
