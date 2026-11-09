import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

class mtu$5 implements ActionListener {
   mtu$5(mtu var1, JPanel var2, String var3) {
      this.EDB = var1;
      this.EDH = var2;
      this.EDE = var3;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mtu.e(this.EDB).remove(this.EDH);
      mtu.d(this.EDB).remove(this.EDE);
      mtu.e(this.EDB).revalidate();
   }
}
