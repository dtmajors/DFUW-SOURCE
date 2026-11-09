import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mvi$6 implements ChangeListener {
   mvi$6(mvi var1) {
      this.EKS = var1;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      mvi.b(this.EKS, var1);
   }
}
