import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mmn$3 implements ChangeListener {
   mmn$3(mmn var1) {
      this.DNe = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mmn.c(this.DNe, mmn.c(this.DNe).getValue());
   }
}
