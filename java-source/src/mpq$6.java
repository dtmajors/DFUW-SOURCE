import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

class mpq$6 implements ActionListener {
   mpq$6(mpq var1, JPanel var2, mjc.b var3, JCheckBox var4) {
      this.DWB = var1;
      this.DWC = var2;
      this.DWD = var3;
      this.DWF = var4;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mpq.a(this.DWB, this.DWC, this.DWD.Name, this.DWF.isSelected());
   }
}
