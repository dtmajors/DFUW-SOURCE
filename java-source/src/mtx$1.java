import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

class mtx$1 extends FocusAdapter {
   mtx$1(mtx var1) {
      this.EEP = var1;
   }

   @Override
   public void focusLost(FocusEvent var1) {
      mtx.a(this.EEP, 0);
   }
}
