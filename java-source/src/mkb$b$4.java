import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;

class mkb$b$4 implements ActionListener {
   mkb$b$4(mkb$b var1, JDialog var2) {
      this.DFa = var1;
      this.DFc = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.DFc.dispose();
   }
}
