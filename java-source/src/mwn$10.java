import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mwn$10 implements ActionListener {
   mwn$10(mwn var1) {
      this.ERI = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mwn.o(this.ERI, var1);
   }
}
