import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mrj$6 implements ChangeListener {
   mrj$6(mrj var1) {
      this.EkK = var1;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      mrj.i(this.EkK);
   }
}
