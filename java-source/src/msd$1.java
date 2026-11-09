import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class msd$1 implements ActionListener {
   msd$1(msd var1) {
      this.EpV = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      msd.a(this.EpV, var1);
   }
}
