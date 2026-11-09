import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mql$2 implements ActionListener {
   mql$2(mql var1) {
      this.EdT = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mql.b(this.EdT, var1);
   }
}
