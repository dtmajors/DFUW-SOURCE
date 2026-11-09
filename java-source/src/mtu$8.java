import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mtu$8 implements ActionListener {
   mtu$8(mtu var1) {
      this.EDB = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mtu.b(this.EDB);
   }
}
