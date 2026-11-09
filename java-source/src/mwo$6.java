import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mwo$6 implements ActionListener {
   mwo$6(mwo var1) {
      this.ERN = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mwo.d(this.ERN, var1);
   }
}
