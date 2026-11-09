import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class msb$2 implements ActionListener {
   msb$2(msb var1) {
      this.Eps = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      msb.b(this.Eps, var1);
   }
}
