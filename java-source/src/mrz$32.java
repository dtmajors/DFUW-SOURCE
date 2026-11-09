import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mrz$32 implements ActionListener {
   mrz$32(mrz var1) {
      this.EoW = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mrz.d(this.EoW, var1.getSource());
   }
}
