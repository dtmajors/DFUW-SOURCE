import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mwa$12 implements ChangeListener {
   mwa$12(mwa var1) {
      this.EOM = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mwa.a(this.EOM, (float)mwa.a(this.EOM).getValue());
   }
}
