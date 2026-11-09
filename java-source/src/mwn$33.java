import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mwn$33 implements ActionListener {
   mwn$33(mwn var1) {
      this.ERI = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      if (mwn.h(this.ERI).isSelected()) {
         mwn.i(this.ERI).setEditable(true);
         mwn.i(this.ERI).setEnabled(true);
      } else {
         mwn.i(this.ERI).setText("");
         mwn.i(this.ERI).setEditable(false);
         mwn.i(this.ERI).setEnabled(false);
      }
   }
}
