import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mwn$11 implements ActionListener {
   mwn$11(mwn var1) {
      this.ERI = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mwn.p(this.ERI, var1);
   }
}
