import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;

class mri$13 implements ActionListener {
   mri$13(mri var1, JDialog var2) {
      this.Ejc = var1;
      this.DVz = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.DVz.dispose();
   }
}
