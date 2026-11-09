import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;

class mtu$6 implements ActionListener {
   mtu$6(mtu var1, JDialog var2) {
      this.EDB = var1;
      this.EtI = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.EtI.dispose();
   }
}
