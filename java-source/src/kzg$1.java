import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class kzg$1 extends KeyAdapter {
   kzg$1(kzg var1) {
      this.qnL = var1;
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      if (var1.getKeyCode() == 10) {
         kzg.a(this.qnL, kzg.a(this.qnL).getText());
      }
   }
}
