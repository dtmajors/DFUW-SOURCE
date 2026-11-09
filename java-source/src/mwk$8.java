import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class mwk$8 extends KeyAdapter {
   mwk$8(mwk var1) {
      this.EPI = var1;
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      if (var1.getKeyCode() == 10) {
         mwk.a(this.EPI);
      }
   }
}
