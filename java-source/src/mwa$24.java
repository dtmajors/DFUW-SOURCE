import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mwa$24 implements ChangeListener {
   mwa$24(mwa var1) {
      this.EOM = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mwa.e(this.EOM, mwa.f(this.EOM).getValue());
   }
}
