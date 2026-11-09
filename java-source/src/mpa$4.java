import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

class mpa$4 implements ActionListener {
   mpa$4(mpa var1, Component var2) {
      this.DUu = var1;
      this.DUv = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      if (JOptionPane.showConfirmDialog(this.DUv, "are you sure you wanto to convert all cities?", "Confirmation", 0) == 0) {
         SwingUtilities.invokeLater(new mpa$4$1(this));
      }
   }
}
