import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mvi$8 implements ChangeListener {
   mvi$8(mvi var1) {
      this.EKS = var1;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      mvi.d(this.EKS, var1);
   }
}
