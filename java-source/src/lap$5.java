import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class lap$5 extends KeyAdapter {
   lap$5(lap var1) {
      this.qtk = var1;
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      if (var1.getKeyCode() == 10) {
         int var2 = lap.b(this.qtk).getSelectedIndex();
         lap.a(this.qtk, var2);
      }
   }
}
