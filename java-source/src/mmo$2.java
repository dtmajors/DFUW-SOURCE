import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mmo$2 implements ChangeListener {
   mmo$2(mmo var1) {
      this.DNk = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mmo.b(this.DNk, mmo.b(this.DNk).getValue());
   }
}
