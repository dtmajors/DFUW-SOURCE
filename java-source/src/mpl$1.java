import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mpl$1 implements ActionListener {
   mpl$1(mpl var1) {
      this.DVx = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = mpl.a(this.DVx);
      if (mpl.b(this.DVx) != null) {
         mpl.c(this.DVx).setText(var2);
         this.DVx.DVv.setTextureName(var2);
         this.DVx.DVv.bxn();
      }
   }
}
