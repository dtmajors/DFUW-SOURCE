import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mmh$6 implements ChangeListener {
   mmh$6(mmh var1) {
      this.DMR = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mmh.b(this.DMR).nF(mmh.f(this.DMR).getValue());
   }
}
