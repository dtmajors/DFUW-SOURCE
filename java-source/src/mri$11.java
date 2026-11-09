import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JList;

class mri$11 implements ActionListener {
   mri$11(mri var1, JList var2, JDialog var3) {
      this.Ejc = var1;
      this.DVy = var2;
      this.DVz = var3;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.Ejc.Ejb = this.DVy.getSelectedIndex();
      this.DVz.dispose();
   }
}
