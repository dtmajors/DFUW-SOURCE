import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class mrg$2 extends MouseAdapter {
   mrg$2(mrg var1) {
      this.EiJ = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      mrg.b(this.EiJ, var1);
   }
}
