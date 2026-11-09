import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class lap$1 extends KeyAdapter {
   lap$1(lap var1) {
      this.qtk = var1;
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      if (var1.getKeyCode() == 10) {
         lap.a(this.qtk);
      }
   }
}
