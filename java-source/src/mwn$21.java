import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mwn$21 implements ActionListener {
   mwn$21(mwn var1) {
      this.ERI = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mwn.x(this.ERI, var1);
   }
}
