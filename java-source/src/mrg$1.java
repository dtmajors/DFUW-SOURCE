import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class mrg$1 extends MouseAdapter {
   mrg$1(mrg var1) {
      this.EiJ = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      mrg.a(this.EiJ, var1);
   }
}
