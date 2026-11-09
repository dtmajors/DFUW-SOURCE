import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mos$4 implements ActionListener {
   mos$4(mos var1) {
      this.DTp = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mos.c(this.DTp, var1);
   }
}
