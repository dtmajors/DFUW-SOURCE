import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

class mve$1 extends FocusAdapter {
   mve$1(mve var1) {
      this.EJP = var1;
   }

   @Override
   public void focusLost(FocusEvent var1) {
      mve.a(this.EJP, 0);
   }
}
