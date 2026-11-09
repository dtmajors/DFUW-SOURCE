import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mwa$5 implements ChangeListener {
   mwa$5(mwa var1) {
      this.EOM = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mwa.k(this.EOM, mwa.l(this.EOM).getValue());
   }
}
