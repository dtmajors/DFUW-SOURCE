import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mwa$26 implements ChangeListener {
   mwa$26(mwa var1) {
      this.EOM = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mwa.g(this.EOM, mwa.h(this.EOM).getValue());
   }
}
