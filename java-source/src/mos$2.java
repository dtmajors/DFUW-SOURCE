import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mos$2 implements ActionListener {
   mos$2(mos var1) {
      this.DTp = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mos.b(this.DTp, var1);
   }
}
