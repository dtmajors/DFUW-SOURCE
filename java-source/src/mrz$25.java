import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JList;

class mrz$25 implements ActionListener {
   mrz$25(mrz var1, JList var2, JDialog var3) {
      this.EoW = var1;
      this.DVy = var2;
      this.DVz = var3;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.EoW.EoU = (String)this.DVy.getSelectedValue();
      this.DVz.dispose();
   }
}
