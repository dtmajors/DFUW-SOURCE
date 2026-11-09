import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mwn$2 implements ActionListener {
   mwn$2(mwn var1) {
      this.ERI = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mwn.i(this.ERI, var1);
   }
}
