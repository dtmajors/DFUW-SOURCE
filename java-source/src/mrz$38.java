import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mrz$38 implements ActionListener {
   mrz$38(mrz var1) {
      this.EoW = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mrz.f(this.EoW);
   }
}
