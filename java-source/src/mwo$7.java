import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mwo$7 implements ActionListener {
   mwo$7(mwo var1) {
      this.ERN = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mwo.e(this.ERN, var1);
   }
}
