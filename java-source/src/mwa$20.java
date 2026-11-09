import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mwa$20 implements ChangeListener {
   mwa$20(mwa var1) {
      this.EOM = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mwa.b(this.EOM, mwa.b(this.EOM).getValue());
   }
}
