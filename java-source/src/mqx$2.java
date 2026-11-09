import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mqx$2 implements ActionListener {
   mqx$2(mqx var1) {
      this.Ehl = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mqx.b(this.Ehl, var1);
   }
}
