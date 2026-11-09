import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mwa$2 implements ChangeListener {
   mwa$2(mwa var1) {
      this.EOM = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mwa.h(this.EOM, mwa.i(this.EOM).getValue());
   }
}
