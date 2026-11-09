import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mus$3 implements ActionListener {
   mus$3(mus var1) {
      this.EHz = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mus.a(this.EHz, var1);
   }
}
