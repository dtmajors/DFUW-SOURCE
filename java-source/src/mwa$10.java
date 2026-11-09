import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mwa$10 implements ChangeListener {
   mwa$10(mwa var1) {
      this.EOM = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mwa.p(this.EOM, mwa.q(this.EOM).getValue());
   }
}
