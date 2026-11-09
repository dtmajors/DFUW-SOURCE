import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mwa$4 implements ChangeListener {
   mwa$4(mwa var1) {
      this.EOM = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mwa.j(this.EOM, mwa.k(this.EOM).getValue());
   }
}
