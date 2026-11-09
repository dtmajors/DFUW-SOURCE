import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mky$1 implements ActionListener {
   mky$1(mky var1) {
      this.DGl = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mky.a(this.DGl, var1);
   }
}
