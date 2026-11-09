import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mwa$1 implements ActionListener {
   mwa$1(mwa var1) {
      this.EOM = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mwa.a(this.EOM, var1);
   }
}
