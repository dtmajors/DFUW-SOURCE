import javax.swing.JColorChooser;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mvh$3 implements ChangeListener {
   mvh$3(mvh var1, JColorChooser var2) {
      this.EKC = var1;
      this.EKD = var2;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      this.EKC.l(this.EKD.getColor());
   }
}
