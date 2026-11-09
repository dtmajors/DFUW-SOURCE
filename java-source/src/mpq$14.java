import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;

class mpq$14 implements ActionListener {
   mpq$14(mpq var1, JSlider var2, JTextField var3, JPanel var4) {
      this.DWB = var1;
      this.DDB = var2;
      this.DDz = var3;
      this.DWC = var4;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.DDB.setValue((int)Float.valueOf(this.DDz.getText()).floatValue());
      mpq.a(this.DWB, this.DWC, "MonsterNumber", this.DDB.getValue());
   }
}
