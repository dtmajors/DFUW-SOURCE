import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

class muw$16 implements ActionListener {
   muw$16(muw var1) {
      this.EJb = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      if (JOptionPane.showConfirmDialog(muw.h(this.EJb), "Do you want to clear All?") == 0) {
         muw.i(this.EJb);
      }
   }
}
