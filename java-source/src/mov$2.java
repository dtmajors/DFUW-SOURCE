import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mov$2 implements ActionListener {
   mov$2(mov var1) {
      this.DTA = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mov.a(this.DTA, var1);
   }
}
