import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class mtx$2 extends KeyAdapter {
   mtx$2(mtx var1) {
      this.EEP = var1;
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      if (var1.getKeyCode() == 10) {
         mtx.a(this.EEP, 0);
      } else if (var1.getKeyCode() == 27) {
         mtx.a(this.EEP).setSelectedIndex(0);
         mtx.b(this.EEP).setText(mtx.a(this.EEP).getSelectedItem().toString());
         mtx.a(this.EEP, 0);
      }
   }
}
