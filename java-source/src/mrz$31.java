import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mrz$31 implements ActionListener {
   mrz$31(mrz var1) {
      this.EoW = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mrz.c(this.EoW, var1.getSource());
   }
}
