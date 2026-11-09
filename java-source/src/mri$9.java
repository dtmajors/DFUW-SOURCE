import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

class mri$9 implements ActionListener {
   mri$9(mri var1) {
      this.Ejc = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      boolean var2 = true;
      if (mri.i(this.Ejc).isSelected()) {
         var2 = false;
         mri.a(this.Ejc, 4);
      } else {
         mri.a(this.Ejc, 0);
      }

      ((JButton)mri.a(this.Ejc).get(1)).setEnabled(var2);
      ((JButton)mri.a(this.Ejc).get(3)).setEnabled(var2);
      ((JButton)mri.a(this.Ejc).get(5)).setEnabled(var2);
      mri.b(this.Ejc);
   }
}
