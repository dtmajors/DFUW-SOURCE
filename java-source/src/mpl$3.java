import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mpl$3 implements ActionListener {
   mpl$3(mpl var1) {
      this.DVx = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int var2 = Integer.parseInt(mpl.e(this.DVx).getText());
      this.DVx.DVv.BK(var2);
      this.DVx.DVv.bxn();
   }
}
