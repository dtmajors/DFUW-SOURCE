import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mwa$8 implements ChangeListener {
   mwa$8(mwa var1) {
      this.EOM = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mwa.n(this.EOM, mwa.o(this.EOM).getValue());
   }
}
