import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class mwo$8 extends KeyAdapter {
   mwo$8(mwo var1) {
      this.ERN = var1;
   }

   @Override
   public void keyReleased(KeyEvent var1) {
      if (var1.getKeyCode() == 10) {
         mwo.a(this.ERN, mwo.b(this.ERN).getText());
      }
   }
}
