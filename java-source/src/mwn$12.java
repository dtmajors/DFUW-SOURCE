import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mwn$12 implements ActionListener {
   mwn$12(mwn var1) {
      this.ERI = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mwn.b(this.ERI, var1);
   }
}
