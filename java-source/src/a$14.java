import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class a$14 extends KeyAdapter {
   a$14(a var1) {
      this.aH = var1;
   }

   @Override
   public void keyReleased(KeyEvent var1) {
      a.a(this.aH, var1);
   }
}
