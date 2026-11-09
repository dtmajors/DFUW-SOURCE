import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

class mrz$36$1 implements ActionListener {
   mrz$36$1(mrz$36 var1, JTextField var2, JTextField var3, JTextField var4, JDialog var5) {
      this.Epc = var1;
      this.Epa = var2;
      this.Epb = var3;
      this.DDz = var4;
      this.DVz = var5;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Double var2 = Double.valueOf(this.Epa.getText());
      Double var3 = Double.valueOf(this.Epb.getText());
      if (this.DDz.getText().length() == 0) {
         JOptionPane.showMessageDialog(mrz.z(this.Epc.EoW), "invalid field name specified");
      } else {
         mrz.y(this.Epc.EoW).add(new mrz$e(this.Epc.EoW, this.DDz.getText(), var2, var3));
         this.DVz.dispose();
         this.Epc.EoZ.updateUI();
         mrz.A(this.Epc.EoW);
      }
   }
}
