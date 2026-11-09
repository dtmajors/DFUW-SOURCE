import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mps$1 implements ActionListener {
   mps$1(mps var1) {
      this.DWY = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mps.a(this.DWY, var1);
   }
}
