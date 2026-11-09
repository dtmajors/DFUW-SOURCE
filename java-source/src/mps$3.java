import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mps$3 implements ActionListener {
   mps$3(mps var1) {
      this.DWY = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mps.c(this.DWY, var1);
   }
}
