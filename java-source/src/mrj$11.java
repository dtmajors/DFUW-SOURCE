import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mrj$11 implements ActionListener {
   mrj$11(mrj var1) {
      this.EkK = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mrj.afq(-1);
      mrj.c(mrj.d(this.EkK), mrj.x(this.EkK));
   }
}
