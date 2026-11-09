import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mwo$5 implements ActionListener {
   mwo$5(mwo var1) {
      this.ERN = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mwo.c(this.ERN, var1);
   }
}
