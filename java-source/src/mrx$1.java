import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class mrx$1 extends MouseAdapter {
   mrx$1(mrx var1) {
      this.Eop = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      mrx.a(this.Eop);
   }
}
