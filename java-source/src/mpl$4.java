import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mpl$4 implements ActionListener {
   mpl$4(mpl var1) {
      this.DVx = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      float var2 = Float.parseFloat(mpl.f(this.DVx).getText());
      this.DVx.DVv.io(var2);
      this.DVx.DVv.bxn();
   }
}
