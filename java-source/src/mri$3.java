import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;

class mri$3 implements ActionListener {
   mri$3(mri var1, JComboBox var2) {
      this.Ejc = var1;
      this.Ejd = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      JComboBox var2 = this.Ejd;
      int var3 = var2.getSelectedIndex();
      mri.d(this.Ejc).afm(var3);
      mri.b(this.Ejc);
   }
}
