import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mvi$2 implements ActionListener {
   mvi$2(mvi var1) {
      this.EKS = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mvi.a(this.EKS, var1);
   }
}
