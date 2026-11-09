import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mrz$c$3 implements ChangeListener {
   mrz$c$3(mrz$c var1, mrz var2) {
      this.Eph = var1;
      this.Epg = var2;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      Object var2 = null;
      Double var3 = mrz$c.b(this.Eph) + mrz$c.c(this.Eph).getValue() * mrz$c.d(this.Eph);
      if (mrz$c.e(this.Eph) instanceof Integer) {
         var2 = var3.intValue();
      } else if (mrz$c.e(this.Eph) instanceof Float) {
         var2 = var3.floatValue();
      } else if (mrz$c.e(this.Eph) instanceof Double) {
         var2 = var3;
      } else {
         if (!(mrz$c.e(this.Eph) instanceof Long)) {
            lfn.b(5, this.getClass().getName(), "stateChanged() :edited value is not float, integer or double");
            return;
         }

         var2 = var3.longValue();
      }

      mrz$c.a(this.Eph, var2);
   }
}
