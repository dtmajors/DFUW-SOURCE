import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mrz$30 implements ActionListener {
   mrz$30(mrz var1) {
      this.EoW = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mrz.b(this.EoW, var1.getSource());
   }
}
