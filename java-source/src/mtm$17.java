import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;

class mtm$17 implements ActionListener {
   mtm$17(mtm var1, JDialog var2) {
      this.Ezt = var1;
      this.EtI = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.EtI.dispose();
   }
}
