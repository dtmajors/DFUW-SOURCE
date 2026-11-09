import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mus$5 implements ActionListener {
   mus$5(mus var1) {
      this.EHz = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mus.c(this.EHz, var1);
   }
}
