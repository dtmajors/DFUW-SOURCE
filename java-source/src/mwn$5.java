import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mwn$5 implements ActionListener {
   mwn$5(mwn var1) {
      this.ERI = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mwn.l(this.ERI, var1);
   }
}
