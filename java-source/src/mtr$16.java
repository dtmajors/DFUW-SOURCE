import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;

class mtr$16 implements ActionListener {
   mtr$16(mtr var1, JDialog var2) {
      this.ECh = var1;
      this.EtI = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.EtI.dispose();
   }
}
