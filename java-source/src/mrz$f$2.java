import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

class mrz$f$2 implements FocusListener {
   mrz$f$2(mrz$f var1, mrz var2) {
      this.Epm = var1;
      this.Epg = var2;
   }

   @Override
   public void focusGained(FocusEvent var1) {
   }

   @Override
   public void focusLost(FocusEvent var1) {
      mrz$f.a(this.Epm);
   }
}
