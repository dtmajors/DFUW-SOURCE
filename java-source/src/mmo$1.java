import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mmo$1 implements ChangeListener {
   mmo$1(mmo var1) {
      this.DNk = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mmo.a(this.DNk, mmo.a(this.DNk).getValue());
   }
}
