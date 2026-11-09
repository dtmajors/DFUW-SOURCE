import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mmn$2 implements ChangeListener {
   mmn$2(mmn var1) {
      this.DNe = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mmn.b(this.DNe, mmn.b(this.DNe).getValue());
   }
}
