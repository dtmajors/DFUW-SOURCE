import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class msc$12 implements ActionListener {
   msc$12(msc var1) {
      this.EpP = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      msc.d(this.EpP, var1);
   }
}
