import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mot$1 implements ActionListener {
   mot$1(mot var1) {
      this.DTx = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.DTx.eHV();
   }
}
