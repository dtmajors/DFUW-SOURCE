import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JList;

class mrj$46 implements ActionListener {
   mrj$46(mrj var1, JList var2, JDialog var3) {
      this.EkK = var1;
      this.DVy = var2;
      this.DVz = var3;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.EkK.Ejb = this.DVy.getSelectedIndex();
      this.DVz.dispose();
   }
}
