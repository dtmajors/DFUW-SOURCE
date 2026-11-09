import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mpl$2 implements ActionListener {
   mpl$2(mpl var1) {
      this.DVx = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      float var2 = Float.parseFloat(mpl.d(this.DVx).getText());
      this.DVx.DVv.l(new ljp(var2, var2));
      this.DVx.DVv.bxn();
   }
}
