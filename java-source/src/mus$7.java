import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mus$7 implements ActionListener {
   mus$7(mus var1) {
      this.EHz = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mus.e(this.EHz, var1);
   }
}
