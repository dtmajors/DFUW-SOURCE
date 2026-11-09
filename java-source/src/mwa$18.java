import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mwa$18 implements ChangeListener {
   mwa$18(mwa var1) {
      this.EOM = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mwa.u(this.EOM, mwa.z(this.EOM).getValue());
   }
}
