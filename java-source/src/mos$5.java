import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mos$5 implements ActionListener {
   mos$5(mos var1) {
      this.DTp = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mos.d(this.DTp, var1);
   }
}
