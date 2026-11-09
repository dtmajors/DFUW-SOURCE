import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mwn$28 implements ActionListener {
   mwn$28(mwn var1) {
      this.ERI = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mwn.m(this.ERI).setVisible(true);
   }
}
