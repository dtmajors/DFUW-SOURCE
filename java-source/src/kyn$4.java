import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class kyn$4 implements ActionListener {
   kyn$4(kyn var1) {
      this.qmb = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      kyn.a(this.qmb, null);
      this.qmb.setVisible(false);
   }
}
