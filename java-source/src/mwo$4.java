import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mwo$4 implements ActionListener {
   mwo$4(mwo var1) {
      this.ERN = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mwo.b(this.ERN, var1);
   }
}
