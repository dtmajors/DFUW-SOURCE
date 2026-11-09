import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mrz$18 implements ActionListener {
   mrz$18(mrz var1) {
      this.EoW = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mrz.w(this.EoW);
   }
}
