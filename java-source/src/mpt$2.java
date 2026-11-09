import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;

class mpt$2 implements ActionListener {
   mpt$2(mpt var1, mpt$a var2) {
      this.DXe = var1;
      this.DXf = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      JCheckBox var2 = (JCheckBox)var1.getSource();
      mpt.a(this.DXe, this.DXf, var2.isSelected());
   }
}
