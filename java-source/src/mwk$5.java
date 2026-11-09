import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class mwk$5 extends KeyAdapter {
   mwk$5(mwk var1) {
      this.EPI = var1;
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      if (var1.getKeyCode() == 40 || var1.getKeyCode() == 38) {
         mwk.d(this.EPI);
      }
   }
}
