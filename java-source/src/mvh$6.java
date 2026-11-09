import javax.swing.JColorChooser;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mvh$6 implements ChangeListener {
   mvh$6(mvh var1, JColorChooser var2) {
      this.EKC = var1;
      this.EKD = var2;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      this.EKC.m(this.EKD.getColor());
   }
}
