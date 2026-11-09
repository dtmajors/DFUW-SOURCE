import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mtu$12 implements ActionListener {
   mtu$12(mtu var1) {
      this.EDB = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      if (this.EDB.DJh.getSelectedIndex() != -1) {
         int var2 = lea.enW().getType((String)this.EDB.DJh.getSelectedItem());
         mtu.a(this.EDB, var2);
      }
   }
}
