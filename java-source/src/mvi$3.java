import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mvi$3 implements ActionListener {
   mvi$3(mvi var1) {
      this.EKS = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mvi.b(this.EKS, var1);
   }
}
