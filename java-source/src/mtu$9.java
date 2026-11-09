import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mtu$9 implements ActionListener {
   mtu$9(mtu var1) {
      this.EDB = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mtu.c(this.EDB);
   }
}
