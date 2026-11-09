import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JList;

class mpl$6 implements ActionListener {
   mpl$6(mpl var1, JList var2, JDialog var3) {
      this.DVx = var1;
      this.DVy = var2;
      this.DVz = var3;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mpl.a(this.DVx, (String)this.DVy.getSelectedValue());
      this.DVz.dispose();
   }
}
