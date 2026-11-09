import java.awt.KeyEventDispatcher;
import java.awt.event.KeyEvent;

class kyr$2 implements KeyEventDispatcher {
   kyr$2(kyr var1) {
      this.qmL = var1;
   }

   @Override
   public boolean dispatchKeyEvent(KeyEvent var1) {
      kyr.a(this.qmL, var1);
      return false;
   }
}
