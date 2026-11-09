import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mrz$41 implements ActionListener {
   mrz$41(mrz var1) {
      this.EoW = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mrz.i(this.EoW);
   }
}
