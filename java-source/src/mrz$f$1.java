import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mrz$f$1 implements ActionListener {
   mrz$f$1(mrz$f var1, mrz var2) {
      this.Epm = var1;
      this.Epg = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mrz$f.a(this.Epm);
   }
}
