import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mwa$21 implements ChangeListener {
   mwa$21(mwa var1) {
      this.EOM = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mwa.c(this.EOM, mwa.c(this.EOM).getValue());
   }
}
