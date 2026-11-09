import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mvi$4 implements ChangeListener {
   mvi$4(mvi var1) {
      this.EKS = var1;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      mvi.a(this.EKS, var1);
   }
}
