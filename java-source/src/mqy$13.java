import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;

class mqy$13 implements ActionListener {
   mqy$13(mqy var1, JDialog var2) {
      this.Ehw = var1;
      this.DVz = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.DVz.dispose();
   }
}
