import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class muw$6 implements ActionListener {
   muw$6(muw var1, String var2) {
      this.EJb = var1;
      this.EJc = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      muw.b(this.EJb, this.EJc);
   }
}
