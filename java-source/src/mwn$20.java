import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mwn$20 implements ActionListener {
   mwn$20(mwn var1) {
      this.ERI = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mwn.w(this.ERI, var1);
   }
}
