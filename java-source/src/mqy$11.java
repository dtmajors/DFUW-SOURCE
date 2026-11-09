import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JList;

class mqy$11 implements ActionListener {
   mqy$11(mqy var1, JList var2, JDialog var3) {
      this.Ehw = var1;
      this.DVy = var2;
      this.DVz = var3;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mqy.a(this.Ehw, (String)this.DVy.getSelectedValue());
      this.DVz.dispose();
   }
}
