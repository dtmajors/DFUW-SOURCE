import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mrz$10 implements ActionListener {
   mrz$10(mrz var1) {
      this.EoW = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mrz.r(this.EoW);
   }
}
