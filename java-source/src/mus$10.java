import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mus$10 implements ActionListener {
   mus$10(mus var1) {
      this.EHz = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mus.g(this.EHz, var1);
   }
}
