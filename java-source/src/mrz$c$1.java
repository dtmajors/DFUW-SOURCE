import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mrz$c$1 implements ActionListener {
   mrz$c$1(mrz$c var1, mrz var2) {
      this.Eph = var1;
      this.Epg = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mrz$c.a(this.Eph);
   }
}
