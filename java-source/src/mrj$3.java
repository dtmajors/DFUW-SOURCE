import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class mrj$3 implements ListSelectionListener {
   mrj$3(mrj var1) {
      this.EkK = var1;
   }

   @Override
   public void valueChanged(ListSelectionEvent var1) {
      int var2 = mrj.j(this.EkK).getSelectedIndex();
      if (var2 != -1) {
         if (var2 < mrj.f(this.EkK).size()) {
            Integer[] var3 = new Integer[mrj.f(this.EkK).size()];
            var3 = mrj.f(this.EkK).toArray(var3);
            this.EkK.afp(var3[var2]);
         }
      }
   }
}
