import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class mrn$a$1 implements KeyListener {
   mrn$a$1(mrn$a var1, mrn var2) {
      this.Elu = var1;
      this.Elt = var2;
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      mrn$a.a(this.Elu, var1);
   }

   @Override
   public void keyReleased(KeyEvent var1) {
   }

   @Override
   public void keyTyped(KeyEvent var1) {
   }
}
