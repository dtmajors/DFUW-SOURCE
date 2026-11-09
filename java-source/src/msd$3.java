import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class msd$3 implements ActionListener {
   msd$3(msd var1) {
      this.EpV = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      msd.c(this.EpV, var1);
   }
}
