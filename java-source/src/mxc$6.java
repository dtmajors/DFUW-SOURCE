import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

class mxc$6 implements ActionListener {
   mxc$6(mxc var1, String var2, JPanel var3) {
      this.ESh = var1;
      this.EEr = var2;
      this.EHm = var3;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mxc.b(this.ESh, this.EEr);
      mxc.d(this.ESh).remove(this.EHm);
      mxc.d(this.ESh).revalidate();
   }
}
