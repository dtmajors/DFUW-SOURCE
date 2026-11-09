import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mog$4 implements ChangeListener {
   mog$4(mog var1) {
      this.DRX = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mog.b(this.DRX).oB(mog.g(this.DRX).getValue());
      mog.h(this.DRX).setText(Integer.toString(mog.g(this.DRX).getValue()));
   }
}
