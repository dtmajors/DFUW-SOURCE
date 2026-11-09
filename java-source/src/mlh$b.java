import java.awt.Component;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class mlh$b extends MouseAdapter {
   mlh$b(mlh var1) {
      this.DIX = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      if (var1.getModifiers() == 4) {
         Component var2 = (Component)var1.getSource();
         if (var2.equals(mlh.h(this.DIX))) {
            mlh.i(this.DIX).show(var1.getComponent(), var1.getX(), var1.getY());
            int var3 = mlh.h(this.DIX).rowAtPoint(new Point(var1.getX(), var1.getY()));
            mlh.h(this.DIX).setRowSelectionInterval(var3, var3);
         } else {
            mlh.j(this.DIX).show(var1.getComponent(), var1.getX(), var1.getY());
            if (var1.getSource() instanceof mkf) {
               mlh.a(this.DIX, (mkf)var1.getSource());
            } else {
               lfn.b(0, this.getClass().getName(), "mousePressed() : PopupSource = " + var1.getSource());
            }
         }
      } else if (var1.getModifiers() == 16) {
         Component var4 = (Component)var1.getSource();
         if (var4 instanceof mkf) {
            mlh.a(this.DIX, (String)((mkf)var4).getSelectedValue());
            lfn.b(0, this.getClass().getSimpleName(), "mousePressed() : SFJList. Selected Value = " + mlh.k(this.DIX));
         }

         if (var1.getClickCount() == 2) {
            if (var4.equals(mlh.h(this.DIX))) {
               mlh.l(this.DIX);
            } else if (var4 instanceof mkf) {
               mlh.a(this.DIX, (String)((mkf)var4).getSelectedValue());
               lfn.b(0, this.getClass().getSimpleName(), "mousePressed() : SFJList. Selected Value = " + mlh.k(this.DIX));
               mlh.l(this.DIX);
            }
         }
      }

      lfn.b(0, "SFAnimationConvertDialog", "actionPerformed() : somthing?");
   }
}
