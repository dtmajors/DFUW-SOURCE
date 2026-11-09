import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mmn$5 implements ChangeListener {
   mmn$5(mmn var1) {
      this.DNe = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mmn.e(this.DNe).yK(mmn.f(this.DNe).eDr());
      if (mmn.f(this.DNe).eDr()) {
         mmn.d(this.DNe).zi(false);
      }

      mmn.h(this.DNe).setEnabled(mmn.f(this.DNe).eDr());
   }
}
