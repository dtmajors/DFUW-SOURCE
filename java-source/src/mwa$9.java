import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mwa$9 implements ChangeListener {
   mwa$9(mwa var1) {
      this.EOM = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mwa.o(this.EOM, mwa.p(this.EOM).getValue());
   }
}
