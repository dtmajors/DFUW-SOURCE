import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mrz$40 implements ActionListener {
   mrz$40(mrz var1) {
      this.EoW = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mrz.h(this.EoW);
   }
}
