import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mwa$3 implements ChangeListener {
   mwa$3(mwa var1) {
      this.EOM = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mwa.i(this.EOM, mwa.j(this.EOM).getValue());
   }
}
