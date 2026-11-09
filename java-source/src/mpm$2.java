import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mpm$2 implements ActionListener {
   mpm$2(mpm var1) {
      this.DVG = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mpm.b(this.DVG, var1);
   }
}
