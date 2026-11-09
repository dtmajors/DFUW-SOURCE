import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

class mrz$c$2 implements FocusListener {
   mrz$c$2(mrz$c var1, mrz var2) {
      this.Eph = var1;
      this.Epg = var2;
   }

   @Override
   public void focusGained(FocusEvent var1) {
   }

   @Override
   public void focusLost(FocusEvent var1) {
      mrz$c.a(this.Eph);
   }
}
