import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mwa$7 implements ChangeListener {
   mwa$7(mwa var1) {
      this.EOM = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mwa.m(this.EOM, mwa.n(this.EOM).getValue());
   }
}
