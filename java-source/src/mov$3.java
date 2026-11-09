import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mov$3 implements ActionListener {
   mov$3(mov var1) {
      this.DTA = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mov.b(this.DTA, var1);
   }
}
