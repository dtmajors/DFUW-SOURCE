import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

class mqn$1 implements ActionListener {
   mqn$1(mqn var1, JTextField var2) {
      this.Eep = var1;
      this.Eeo = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mqn.a(this.Eep, this.Eeo.getText());
   }
}
