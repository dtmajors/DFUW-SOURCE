import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mwn$23 implements ActionListener {
   mwn$23(mwn var1) {
      this.ERI = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mwn.c(this.ERI, var1);
   }
}
