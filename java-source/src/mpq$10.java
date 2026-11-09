import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JTextField;

class mpq$10 implements ActionListener {
   mpq$10(mpq var1, JPanel var2, mjc.b var3, JTextField var4) {
      this.DWB = var1;
      this.DWC = var2;
      this.DWD = var3;
      this.DDz = var4;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mpq.a(this.DWB, this.DWC, this.DWD.Name, Integer.valueOf(this.DDz.getText()));
   }
}
