import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

class msi$3 implements ActionListener {
   msi$3(msi var1) {
      this.EtH = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      if (!msi.o(this.EtH)) {
         JOptionPane.showMessageDialog(null, "There have been no changes, not saving.");
      } else {
         this.EtH.eNp();
      }
   }
}
