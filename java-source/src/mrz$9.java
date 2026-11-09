import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mrz$9 implements ActionListener {
   mrz$9(mrz var1) {
      this.EoW = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mrz.q(this.EoW);
   }
}
