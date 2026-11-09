import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mmh$1 implements ChangeListener {
   mmh$1(mmh var1) {
      this.DMR = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mmh.b(this.DMR).iF(mmh.a(this.DMR).getValue());
   }
}
