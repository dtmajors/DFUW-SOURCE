import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mwn$15 implements ActionListener {
   mwn$15(mwn var1) {
      this.ERI = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mwn.r(this.ERI, var1);
   }
}
