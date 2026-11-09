import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class mua$8 extends MouseAdapter {
   mua$8(mua var1) {
      this.EFo = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if ((var1.getModifiers() & 2) != 0) {
         mua.c(this.EFo);
      } else {
         this.EFo.x(var1);
      }
   }
}
