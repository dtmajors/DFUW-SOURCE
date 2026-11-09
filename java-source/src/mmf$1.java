import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mmf$1 implements ChangeListener {
   mmf$1(mmf var1) {
      this.DMd = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mmf.a(this.DMd, mmf.a(this.DMd).getValue());
   }
}
