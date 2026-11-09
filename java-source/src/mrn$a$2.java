import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

class mrn$a$2 implements MouseMotionListener {
   mrn$a$2(mrn$a var1, mrn var2) {
      this.Elu = var1;
      this.Elt = var2;
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
      mrn$a.a(this.Elu, var1);
   }

   @Override
   public void mouseMoved(MouseEvent var1) {
   }
}
