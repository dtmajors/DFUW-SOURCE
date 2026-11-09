import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mua$7 implements ChangeListener {
   mua$7(mua var1) {
      this.EFo = var1;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      mua.a(this.EFo, true);
   }
}
