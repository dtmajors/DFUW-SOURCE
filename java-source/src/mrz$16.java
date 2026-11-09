import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mrz$16 implements ActionListener {
   mrz$16(mrz var1) {
      this.EoW = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mrz.v(this.EoW).aO(mje.DBl);
   }
}
