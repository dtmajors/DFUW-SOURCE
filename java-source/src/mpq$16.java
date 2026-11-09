import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JPanel;

class mpq$16 implements ActionListener {
   mpq$16(mpq var1, JPanel var2, JComboBox var3) {
      this.DWB = var1;
      this.DWC = var2;
      this.DWJ = var3;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mpq.a(this.DWB, this.DWC, "MonsterName", (String)this.DWJ.getSelectedItem());
   }
}
