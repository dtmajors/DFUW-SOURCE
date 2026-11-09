import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mpx$3 implements ActionListener {
   mpx$3(mpx var1) {
      this.DXr = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mpx.c(this.DXr, var1);
   }
}
