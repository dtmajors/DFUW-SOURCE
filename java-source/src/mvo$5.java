import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mvo$5 implements ActionListener {
   mvo$5(mvo var1) {
      this.ELs = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mvo.h(this.ELs).BA(mvo.g(this.ELs).getSelectedIndex());
   }
}
