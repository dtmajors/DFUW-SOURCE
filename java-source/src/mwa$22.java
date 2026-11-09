import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mwa$22 implements ChangeListener {
   mwa$22(mwa var1) {
      this.EOM = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mwa.a(this.EOM, mwa.d(this.EOM).getValue());
   }
}
