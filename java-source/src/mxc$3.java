import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

class mxc$3 implements ActionListener {
   mxc$3(mxc var1) {
      this.ESh = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mxc.a(this.ESh, JOptionPane.showInputDialog(mxc.a(this.ESh), "SFFile Name"));
      mxc.a(this.ESh).rescanCurrentDirectory();
   }
}
