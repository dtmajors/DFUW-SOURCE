import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class mwn$27 extends KeyAdapter {
   mwn$27(mwn var1) {
      this.ERI = var1;
   }

   @Override
   public void keyReleased(KeyEvent var1) {
      if (var1.getKeyCode() == 10) {
         mwn.l(this.ERI);
      }
   }
}
