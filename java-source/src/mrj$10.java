import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mrj$10 implements ChangeListener {
   mrj$10(mrj var1) {
      this.EkK = var1;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      if (mrj.r(this.EkK).getSelectedIndex() == 0) {
         mrj.s(this.EkK).setSelected(true);
         mrj.t(this.EkK).setEnabled(true);
         mrj.u(this.EkK).setEnabled(true);
      } else if (mrj.r(this.EkK).getSelectedIndex() == 1) {
         mrj.v(this.EkK).setSelected(true);
         mrj.t(this.EkK).setEnabled(false);
         mrj.u(this.EkK).setEnabled(false);
      } else if (mrj.r(this.EkK).getSelectedIndex() == 2) {
         mrj.v(this.EkK).setSelected(true);
         mrj.t(this.EkK).setEnabled(false);
         mrj.u(this.EkK).setEnabled(false);
      } else if (mrj.r(this.EkK).getSelectedIndex() == 4) {
         mrj.s(this.EkK).setSelected(true);
         mrj.t(this.EkK).setEnabled(false);
         mrj.u(this.EkK).setEnabled(false);
      }

      mrj.i(this.EkK);
      if (mrj.r(this.EkK).getSelectedIndex() == 2) {
         mrj.a(this.EkK, true);
         mrj.w(this.EkK);
      } else {
         mrj.a(this.EkK, false);
      }
   }
}
