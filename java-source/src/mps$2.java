import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mps$2 implements ActionListener {
   mps$2(mps var1) {
      this.DWY = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mps.b(this.DWY, var1);
   }
}
