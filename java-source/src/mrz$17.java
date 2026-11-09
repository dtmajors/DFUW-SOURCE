import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;

class mrz$17 implements ActionListener {
   mrz$17(mrz var1, JCheckBox var2) {
      this.EoW = var1;
      this.EoY = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mrz.a(this.EoW, this.EoY.isSelected());
   }
}
