import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mvi$7 implements ChangeListener {
   mvi$7(mvi var1) {
      this.EKS = var1;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      mvi.c(this.EKS, var1);
   }
}
