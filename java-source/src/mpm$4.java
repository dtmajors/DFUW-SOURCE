import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mpm$4 implements ActionListener {
   mpm$4(mpm var1) {
      this.DVG = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mpm.d(this.DVG, var1);
   }
}
