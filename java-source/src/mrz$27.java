import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mrz$27 implements ActionListener {
   mrz$27(mrz var1) {
      this.EoW = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mrz.a(this.EoW, var1.getSource());
   }
}
