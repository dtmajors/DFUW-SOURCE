import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JColorChooser;

class mvh$7 implements ActionListener {
   mvh$7(mvh var1, JColorChooser var2) {
      this.EKC = var1;
      this.EKD = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.EKC.m(this.EKD.getColor());
   }
}
