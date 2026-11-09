import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mld$10 implements ActionListener {
   mld$10(mld var1) {
      this.DHD = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.DHD.nvS.remove(1);
      this.DHD.repaint();
   }
}
