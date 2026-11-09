import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mwn$16 implements ActionListener {
   mwn$16(mwn var1) {
      this.ERI = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mwn.s(this.ERI, var1);
   }
}
