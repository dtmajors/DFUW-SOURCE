import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;

class mtt$13 implements ActionListener {
   mtt$13(mtt var1, JDialog var2) {
      this.EDj = var1;
      this.EtI = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.EtI.dispose();
   }
}
