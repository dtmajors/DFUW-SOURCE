import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mwa$11 implements ChangeListener {
   mwa$11(mwa var1) {
      this.EOM = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mwa.q(this.EOM, mwa.r(this.EOM).getValue());
   }
}
