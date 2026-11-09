import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mwa$23 implements ChangeListener {
   mwa$23(mwa var1) {
      this.EOM = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mwa.d(this.EOM, mwa.e(this.EOM).getValue());
   }
}
