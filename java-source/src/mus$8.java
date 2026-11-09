import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mus$8 implements ActionListener {
   mus$8(mus var1) {
      this.EHz = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mus.f(this.EHz, var1);
   }
}
