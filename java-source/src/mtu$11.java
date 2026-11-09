import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mtu$11 implements ActionListener {
   mtu$11(mtu var1) {
      this.EDB = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      if (this.EDB.EDu.getSelectedIndex() != -1) {
         float var2 = this.EDB.EDu.getSelectedIndex() != 0 ? Float.valueOf((String)this.EDB.EDu.getSelectedItem()) : -1.0F;
         mtu.a(this.EDB, var2);
      }
   }
}
