import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mwn$22 implements ActionListener {
   mwn$22(mwn var1) {
      this.ERI = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mwn.y(this.ERI, var1);
   }
}
