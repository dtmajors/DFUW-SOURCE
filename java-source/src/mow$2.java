import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mow$2 implements ActionListener {
   mow$2(mow var1) {
      this.DTH = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mow.b(this.DTH, var1);
   }
}
