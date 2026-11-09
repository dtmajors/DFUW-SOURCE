import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mmo$3 implements ChangeListener {
   mmo$3(mmo var1) {
      this.DNk = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mmo.c(this.DNk, mmo.c(this.DNk).getValue());
   }
}
