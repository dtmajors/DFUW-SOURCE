import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mpx$2 implements ActionListener {
   mpx$2(mpx var1) {
      this.DXr = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mpx.b(this.DXr, var1);
   }
}
