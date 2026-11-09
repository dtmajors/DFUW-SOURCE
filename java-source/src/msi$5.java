import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class msi$5 implements ActionListener {
   msi$5(msi var1) {
      this.EtH = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      msi.V(this.EtH).doClick();
   }
}
