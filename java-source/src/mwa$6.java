import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mwa$6 implements ChangeListener {
   mwa$6(mwa var1) {
      this.EOM = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mwa.l(this.EOM, mwa.m(this.EOM).getValue());
   }
}
