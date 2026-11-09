import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mrj$37 implements ActionListener {
   mrj$37(mrj var1) {
      this.EkK = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int var2 = mrj.g(this.EkK).getSelectedIndex();
      if (var2 != -1) {
         dqx.gQG = ((dqu)mrj.e(this.EkK).get(var2)).gPI;
      }
   }
}
