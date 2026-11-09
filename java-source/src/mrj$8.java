import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mrj$8 implements ActionListener {
   mrj$8(mrj var1) {
      this.EkK = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mrj$a var2 = (mrj$a)mrj.m(this.EkK);
      var2.afm(mrj.n(this.EkK).getSelectedIndex());
      mrj.i(this.EkK);
   }
}
