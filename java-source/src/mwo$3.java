import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mwo$3 implements ActionListener {
   mwo$3(mwo var1) {
      this.ERN = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mwo.a(this.ERN, var1);
   }
}
