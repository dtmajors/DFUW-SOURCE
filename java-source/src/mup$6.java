import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;

class mup$6 implements ActionListener {
   mup$6(mup var1, JDialog var2) {
      this.EHo = var1;
      this.EtI = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.EtI.dispose();
   }
}
