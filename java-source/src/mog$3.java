import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mog$3 implements ChangeListener {
   mog$3(mog var1) {
      this.DRX = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mog.b(this.DRX).afa(mog.e(this.DRX).getValue());
      mog.f(this.DRX).setText(Integer.toString(mog.e(this.DRX).getValue()));
   }
}
