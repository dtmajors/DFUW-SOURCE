import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

class mqq$5 extends FocusAdapter {
   mqq$5(mqq var1) {
      this.Egn = var1;
   }

   @Override
   public void focusLost(FocusEvent var1) {
      mqq.a(this.Egn, var1);
   }
}
