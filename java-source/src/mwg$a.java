import java.awt.Component;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class mwg$a extends MouseAdapter {
   mwg$a(mwg var1) {
      this.EPd = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      if (var1.getModifiers() == 4) {
         mwg.b(this.EPd).show(var1.getComponent(), var1.getX(), var1.getY());
         Component var2 = (Component)var1.getSource();
         if (var2.equals(mwg.c(this.EPd))) {
            int var3 = mwg.c(this.EPd).rowAtPoint(new Point(var1.getX(), var1.getY()));
            int var4 = mwg.c(this.EPd).getSelectedRowCount();
            if (var4 == 0) {
               mwg.c(this.EPd).setRowSelectionInterval(var3, var3);
            }
         }
      } else if (var1.getModifiers() == 16 && var1.getClickCount() == 2) {
         Component var5 = (Component)var1.getSource();
         if (var5.equals(mwg.c(this.EPd))) {
            mwg.d(this.EPd);
         }
      }
   }
}
