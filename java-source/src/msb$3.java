import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class msb$3 implements ActionListener {
   msb$3(msb var1) {
      this.Eps = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      msb.c(this.Eps, var1);
   }
}
