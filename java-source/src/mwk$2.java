import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mwk$2 implements ActionListener {
   mwk$2(mwk var1) {
      this.EPI = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.EPI.dispose();
   }
}
