import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mwn$43 implements ActionListener {
   mwn$43(mwn var1) {
      this.ERI = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mwn.g(this.ERI, var1);
   }
}
