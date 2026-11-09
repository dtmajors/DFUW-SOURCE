import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mvu$7 implements ActionListener {
   mvu$7(mvu var1) {
      this.EMm = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mvu.a(this.EMm, (String)this.EMm.eQK().getSelectedItem());
   }
}
