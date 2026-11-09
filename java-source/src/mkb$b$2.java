import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;

class mkb$b$2 implements ActionListener {
   mkb$b$2(mkb$b var1, JCheckBox var2) {
      this.DFa = var1;
      this.DFb = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.DFa.DEO.setMultiSelectionEnabled(this.DFb.isSelected());
   }
}
