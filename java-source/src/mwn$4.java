import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mwn$4 implements ActionListener {
   mwn$4(mwn var1) {
      this.ERI = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mwn.k(this.ERI, var1);
   }
}
