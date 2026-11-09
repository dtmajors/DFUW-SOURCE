import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mwn$1 implements ActionListener {
   mwn$1(mwn var1) {
      this.ERI = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mwn.a(this.ERI, var1);
   }
}
