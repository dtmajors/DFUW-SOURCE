import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mrz$39 implements ActionListener {
   mrz$39(mrz var1) {
      this.EoW = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mrz.g(this.EoW);
   }
}
