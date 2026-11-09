import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mld$2 implements ActionListener {
   mld$2(mld var1) {
      this.DHD = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.DHD.nvS.remove(8192);
      this.DHD.repaint();
   }
}
