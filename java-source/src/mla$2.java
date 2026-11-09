import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class mla$2 extends KeyAdapter {
   mla$2(mla var1) {
      this.DGE = var1;
   }

   @Override
   public void keyReleased(KeyEvent var1) {
      this.DGE.d(var1);
   }
}
