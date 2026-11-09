import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class a$5 extends MouseAdapter {
   a$5(a var1) {
      this.aH = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (var1.getButton() == 1) {
         int var2 = a.c(this.aH).locationToIndex(var1.getPoint());
         if (var2 == -1) {
            return;
         }

         a$b var3 = (a$b)a.c(this.aH).getModel().getElementAt(var2);
         var3.setSelected(!var3.isSelected());
         Rectangle var4 = a.c(this.aH).getCellBounds(var2, var2);
         a.c(this.aH).repaint(var4);
      } else if (var1.getButton() == 3) {
         this.aH.aG.show(var1.getComponent(), var1.getX(), var1.getY());
      }
   }
}
