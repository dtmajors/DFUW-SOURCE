import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class msb$1 implements ActionListener {
   msb$1(msb var1) {
      this.Eps = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      msb.a(this.Eps, var1);
   }
}
