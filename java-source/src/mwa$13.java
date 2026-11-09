import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mwa$13 implements ChangeListener {
   mwa$13(mwa var1) {
      this.EOM = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mwa.r(this.EOM, mwa.s(this.EOM).getValue());
   }
}
