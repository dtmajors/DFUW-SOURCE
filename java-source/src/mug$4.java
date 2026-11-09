import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class mug$4 extends MouseAdapter {
   mug$4(mug var1) {
      this.EGl = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (var1.getClickCount() == 2) {
         this.EGl.y(var1);
      } else {
         super.mouseClicked(var1);
      }
   }
}
