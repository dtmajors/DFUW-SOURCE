import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

class mld$3 implements FocusListener {
   mld$3(mld var1) {
      this.DHD = var1;
   }

   @Override
   public void focusGained(FocusEvent var1) {
      this.DHD.nvS.remove(8192);
      this.DHD.repaint();
   }

   @Override
   public void focusLost(FocusEvent var1) {
   }
}
