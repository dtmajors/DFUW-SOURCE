import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class mrj$2 implements ListSelectionListener {
   mrj$2(mrj var1) {
      this.EkK = var1;
   }

   @Override
   public void valueChanged(ListSelectionEvent var1) {
      mrj.i(this.EkK);
   }
}
