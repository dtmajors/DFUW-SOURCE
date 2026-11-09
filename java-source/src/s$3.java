import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class s$3 implements KeyListener {
   s$3(s var1) {
      this.cS = var1;
   }

   @Override
   public void keyTyped(KeyEvent var1) {
      assert lda.by(var1);
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      s.a(this.cS, var1, true);
   }

   @Override
   public void keyReleased(KeyEvent var1) {
      s.a(this.cS, var1, false);
   }
}
