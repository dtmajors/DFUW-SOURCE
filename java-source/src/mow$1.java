import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mow$1 implements ActionListener {
   mow$1(mow var1) {
      this.DTH = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mow.a(this.DTH, var1);
   }
}
