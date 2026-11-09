import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mus$4 implements ActionListener {
   mus$4(mus var1) {
      this.EHz = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mus.b(this.EHz, var1);
   }
}
