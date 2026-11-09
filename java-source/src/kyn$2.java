import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class kyn$2 extends KeyAdapter {
   kyn$2(kyn var1) {
      this.qmb = var1;
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      if (var1.getKeyCode() == 10) {
         kyn.a(this.qmb);
      }
   }
}
