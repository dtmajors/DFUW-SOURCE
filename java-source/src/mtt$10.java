import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mtt$10 implements ActionListener {
   mtt$10(mtt var1) {
      this.EDj = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mtt.c(this.EDj, 2);
      mtt.a(this.EDj, true);
   }
}
