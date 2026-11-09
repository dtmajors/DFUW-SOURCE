import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;

class mrz$26 implements ActionListener {
   mrz$26(mrz var1, JDialog var2) {
      this.EoW = var1;
      this.DVz = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.DVz.dispose();
   }
}
