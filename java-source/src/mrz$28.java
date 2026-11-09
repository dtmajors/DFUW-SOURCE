import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

class mrz$28 implements FocusListener {
   mrz$28(mrz var1) {
      this.EoW = var1;
   }

   @Override
   public void focusGained(FocusEvent var1) {
   }

   @Override
   public void focusLost(FocusEvent var1) {
      mrz.a(this.EoW, var1.getSource());
   }
}
