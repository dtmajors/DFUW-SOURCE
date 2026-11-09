import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mmn$4 implements ChangeListener {
   mmn$4(mmn var1) {
      this.DNe = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mmn.e(this.DNe).yL(mmn.d(this.DNe).eDr());
      if (mmn.d(this.DNe).eDr()) {
         mmn.f(this.DNe).zi(false);
      }

      mmn.g(this.DNe).setEnabled(mmn.d(this.DNe).eDr());
   }
}
