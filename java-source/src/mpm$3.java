import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mpm$3 implements ActionListener {
   mpm$3(mpm var1) {
      this.DVG = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mpm.c(this.DVG, var1);
   }
}
