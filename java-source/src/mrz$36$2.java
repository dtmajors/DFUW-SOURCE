import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;

class mrz$36$2 implements ActionListener {
   mrz$36$2(mrz$36 var1, JDialog var2) {
      this.Epc = var1;
      this.DVz = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.DVz.dispose();
   }
}
