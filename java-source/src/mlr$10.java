import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mlr$10 implements ActionListener {
   mlr$10(mlr var1) {
      this.DKI = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mlr.d(this.DKI, var1);
   }
}
