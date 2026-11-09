import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;

class mrj$47 implements ActionListener {
   mrj$47(mrj var1, JDialog var2) {
      this.EkK = var1;
      this.DVz = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.DVz.dispose();
   }
}
