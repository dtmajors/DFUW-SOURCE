import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mqx$1 implements ActionListener {
   mqx$1(mqx var1) {
      this.Ehl = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mqx.a(this.Ehl, var1);
   }
}
