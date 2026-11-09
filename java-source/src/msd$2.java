import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class msd$2 implements ActionListener {
   msd$2(msd var1) {
      this.EpV = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      msd.b(this.EpV, var1);
   }
}
