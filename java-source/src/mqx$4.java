import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mqx$4 implements ActionListener {
   mqx$4(mqx var1) {
      this.Ehl = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mqx.d(this.Ehl, var1);
   }
}
