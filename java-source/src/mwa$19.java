import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mwa$19 implements ChangeListener {
   mwa$19(mwa var1) {
      this.EOM = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mwa.v(this.EOM, mwa.A(this.EOM).getValue());
   }
}
