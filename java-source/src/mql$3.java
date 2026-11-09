import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mql$3 implements ActionListener {
   mql$3(mql var1) {
      this.EdT = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mql.c(this.EdT, var1);
   }
}
