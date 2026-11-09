import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mtt$6 implements ActionListener {
   mtt$6(mtt var1) {
      this.EDj = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mtt.c(this.EDj, 1);
      mtt.a(this.EDj, true);
   }
}
