import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mwn$3 implements ActionListener {
   mwn$3(mwn var1) {
      this.ERI = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mwn.j(this.ERI, var1);
   }
}
