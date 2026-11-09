import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mmn$1 implements ChangeListener {
   mmn$1(mmn var1) {
      this.DNe = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mmn.a(this.DNe, mmn.a(this.DNe).getValue());
   }
}
