import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mrz$7 implements ActionListener {
   mrz$7(mrz var1) {
      this.EoW = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mrz.o(this.EoW);
   }
}
