import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mwa$16 implements ChangeListener {
   mwa$16(mwa var1) {
      this.EOM = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mwa.s(this.EOM, mwa.x(this.EOM).getValue());
   }
}
