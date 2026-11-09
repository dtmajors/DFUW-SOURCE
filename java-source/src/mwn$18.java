import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mwn$18 implements ActionListener {
   mwn$18(mwn var1) {
      this.ERI = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mwn.u(this.ERI, var1);
   }
}
