import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mwa$25 implements ChangeListener {
   mwa$25(mwa var1) {
      this.EOM = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mwa.f(this.EOM, mwa.g(this.EOM).getValue());
   }
}
