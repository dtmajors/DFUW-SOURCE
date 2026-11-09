import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mwa$17 implements ChangeListener {
   mwa$17(mwa var1) {
      this.EOM = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mwa.t(this.EOM, mwa.y(this.EOM).getValue());
   }
}
