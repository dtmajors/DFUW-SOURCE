import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mpl$5 implements ActionListener {
   mpl$5(mpl var1) {
      this.DVx = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int var2 = Integer.parseInt(mpl.g(this.DVx).getText());
      this.DVx.DVv.BL(var2);
      this.DVx.DVv.bxn();
   }
}
