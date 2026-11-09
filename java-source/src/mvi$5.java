import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mvi$5 implements ActionListener {
   mvi$5(mvi var1) {
      this.EKS = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mvi.c(this.EKS, var1);
   }
}
