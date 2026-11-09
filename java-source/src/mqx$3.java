import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mqx$3 implements ActionListener {
   mqx$3(mqx var1) {
      this.Ehl = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mqx.c(this.Ehl, var1);
   }
}
