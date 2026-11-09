import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mql$1 implements ActionListener {
   mql$1(mql var1) {
      this.EdT = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mql.a(this.EdT, var1);
   }
}
