import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mrz$33 implements ActionListener {
   mrz$33(mrz var1) {
      this.EoW = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mrz.e(this.EoW, var1.getSource());
   }
}
