import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

class mri$2 implements ActionListener {
   mri$2(mri var1) {
      this.Ejc = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      if (JOptionPane.showConfirmDialog(mri.c(this.Ejc), "Are you sure you want to save the terrain mesh? Original file can only be recovered from network.")
         == 0) {
         kra var2 = (kra)mri.c(this.Ejc).ii(4101);
         mri.c(this.Ejc).a(var2, null, null);
      }
   }
}
