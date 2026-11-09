import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mow$3 implements ActionListener {
   mow$3(mow var1) {
      this.DTH = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mow.c(this.DTH, var1);
   }
}
