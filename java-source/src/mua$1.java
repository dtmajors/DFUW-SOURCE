import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class mua$1 implements KeyListener {
   mua$1(mua var1) {
      this.EFo = var1;
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      if (var1.getKeyCode() == 127) {
         this.EFo.j(var1);
      }
   }

   @Override
   public void keyReleased(KeyEvent var1) {
   }

   @Override
   public void keyTyped(KeyEvent var1) {
   }
}
