import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mrz$4 implements ActionListener {
   mrz$4(mrz var1) {
      this.EoW = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mrz.n(this.EoW);
   }
}
