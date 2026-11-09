import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mmf$2 implements ChangeListener {
   mmf$2(mmf var1) {
      this.DMd = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mmf.b(this.DMd, mmf.b(this.DMd).getValue());
   }
}
