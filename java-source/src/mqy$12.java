import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

class mqy$12 implements ActionListener {
   mqy$12(mqy var1) {
      this.Ehw = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      JTextField var2 = (JTextField)var1.getSource();
      mqy.c(this.Ehw).jq(var2.getText());
   }
}
