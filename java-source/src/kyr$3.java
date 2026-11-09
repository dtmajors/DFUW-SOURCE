import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class kyr$3 extends KeyAdapter {
   kyr$3(kyr var1) {
      this.qmL = var1;
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      kyr.b(this.qmL, var1);
   }

   @Override
   public void keyReleased(KeyEvent var1) {
      kyr.c(this.qmL, var1);
   }
}
