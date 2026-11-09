import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mrz$6 implements ActionListener {
   mrz$6(mrz var1) {
      this.EoW = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mrz.b(this.EoW, var1.getActionCommand());
   }
}
