import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mrz$1 implements ActionListener {
   mrz$1(mrz var1) {
      this.EoW = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mrz.a(this.EoW, mrz.c(this.EoW).getText());
   }
}
