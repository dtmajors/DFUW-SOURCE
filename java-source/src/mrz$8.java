import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mrz$8 implements ActionListener {
   mrz$8(mrz var1) {
      this.EoW = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mrz.p(this.EoW);
   }
}
