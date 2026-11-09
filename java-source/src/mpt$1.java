import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class mpt$1 implements KeyListener {
   mpt$1(mpt var1) {
      this.DXe = var1;
   }

   @Override
   public void keyPressed(KeyEvent var1) {
   }

   @Override
   public void keyReleased(KeyEvent var1) {
   }

   @Override
   public void keyTyped(KeyEvent var1) {
      mpt.b(this.DXe).CM(mpt.a(this.DXe).getText());
   }
}
