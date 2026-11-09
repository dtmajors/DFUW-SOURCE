import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JPanel;

class mpq$2 implements ActionListener {
   mpq$2(mpq var1, JPanel var2, mjc.b var3, JComboBox var4) {
      this.DWB = var1;
      this.DWC = var2;
      this.DWD = var3;
      this.DWE = var4;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mpq.a(this.DWB, this.DWC, this.DWD.Name, (String)this.DWE.getSelectedItem());
   }
}
