import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mpx$4 implements ActionListener {
   mpx$4(mpx var1) {
      this.DXr = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mpx.d(this.DXr, var1);
   }
}
