import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mpr$2 implements ActionListener {
   mpr$2(mpr var1) {
      this.DWX = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mpr.b(this.DWX);
   }
}
