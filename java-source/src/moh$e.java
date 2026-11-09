import java.awt.Component;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class moh$e extends MouseAdapter {
   moh$e(moh var1) {
      this.DSw = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      if (var1.getModifiers() == 4) {
         moh.g(this.DSw).show(var1.getComponent(), var1.getX(), var1.getY());
         Component var2 = (Component)var1.getSource();
         if (var2.equals(this.DSw.DSo)) {
            int var3 = this.DSw.DSo.rowAtPoint(new Point(var1.getX(), var1.getY()));
            this.DSw.DSo.setRowSelectionInterval(var3, var3);
         }
      } else if (var1.getModifiers() == 16 && var1.getClickCount() == 2) {
         Component var6 = (Component)var1.getSource();
         if (var6.equals(this.DSw.DSo)) {
            if (this.DSw.DSo.getSelectedColumn() == 2) {
               return;
            }

            int var7 = this.DSw.DSo.getSelectedRow();
            mof var4 = ((mod)this.DSw.DSo.getModel()).aeY(var7);
            mog var5 = new mog(var4);
            moh.h(this.DSw).eCu().add(var5);
            var5.setVisible(true);
         }
      }
   }
}
