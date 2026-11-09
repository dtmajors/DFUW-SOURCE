import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JPanel;

class mpq$13 implements ActionListener {
   mpq$13(mpq var1, mjc.b var2, JPanel var3, JComboBox var4) {
      this.DWB = var1;
      this.DWD = var2;
      this.DWC = var3;
      this.DWE = var4;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      if (this.DWD.Type == mjc.c.Dzz.ordinal()) {
         mpq.a(this.DWB, this.DWC, this.DWD.Name, this.DWE.getSelectedIndex());
      } else if (this.DWD.Type == mjc.c.DzA.ordinal()) {
         mpq.a(this.DWB, this.DWC, this.DWD.Name, (String)this.DWE.getSelectedItem());
      }
   }
}
