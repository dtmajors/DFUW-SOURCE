import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class mtm$12 extends KeyAdapter {
   mtm$12(mtm var1) {
      this.Ezt = var1;
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      if (var1.getKeyCode() == 40 || var1.getKeyCode() == 38) {
         mtm.a(this.Ezt);
         mtm.b(this.Ezt);
      }
   }
}
