import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;

class mpq$15 implements ActionListener {
   mpq$15(mpq var1, JPanel var2, mjc.b var3, JComboBox var4, Vector var5, JComboBox var6, JSlider var7, JTextField var8) {
      this.DWB = var1;
      this.DWC = var2;
      this.DWD = var3;
      this.DWE = var4;
      this.DWI = var5;
      this.DWJ = var6;
      this.DDB = var7;
      this.DDz = var8;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mpq.a(this.DWB, this.DWC, this.DWD.Name, (String)this.DWE.getSelectedItem());
      this.DWI.clear();
      this.DWI.add("");
      this.DWI.addAll(mpq.a(this.DWB, (String)this.DWE.getSelectedItem()));
      this.DWJ.setSelectedIndex(0);
      this.DWJ.revalidate();
      this.DDB.setValue(0);
      this.DDz.setText("0");
   }
}
