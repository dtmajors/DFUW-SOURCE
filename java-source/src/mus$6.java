import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mus$6 implements ActionListener {
   mus$6(mus var1) {
      this.EHz = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mus.d(this.EHz, var1);
   }
}
