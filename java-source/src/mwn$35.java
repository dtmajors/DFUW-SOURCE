import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mwn$35 implements ActionListener {
   mwn$35(mwn var1) {
      this.ERI = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      if (mwn.q(this.ERI).isSelected()) {
         mwn.r(this.ERI).setValue(0);
         mwn.s(this.ERI).setValue(0);
         mwn.t(this.ERI).setValue(0);
         mwn.r(this.ERI).setEnabled(false);
         mwn.s(this.ERI).setEnabled(false);
         mwn.t(this.ERI).setEnabled(false);
      } else {
         mwn.r(this.ERI).setEnabled(true);
         mwn.s(this.ERI).setEnabled(true);
         mwn.t(this.ERI).setEnabled(true);
      }
   }
}
