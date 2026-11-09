import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class mrj$54 implements ListSelectionListener {
   mrj$54(mrj var1) {
      this.EkK = var1;
   }

   @Override
   public void valueChanged(ListSelectionEvent var1) {
      int var2 = mrj.g(this.EkK).getSelectedIndex();
      if (var2 == -1) {
         this.EkK.afp(1);
      } else {
         this.EkK.afp(((dqu)mrj.e(this.EkK).get(var2)).gPI);
      }
   }
}
