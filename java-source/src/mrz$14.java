import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class mrz$14 implements ListSelectionListener {
   mrz$14(mrz var1) {
      this.EoW = var1;
   }

   @Override
   public void valueChanged(ListSelectionEvent var1) {
      int var2 = mrz.m(this.EoW).getSelectedIndex();
      if (var2 != -1) {
         int var3 = (Integer)mrz.j(this.EoW).get(var2);
         mrz.a(this.EoW, var3);
         mrz.t(this.EoW).clearSelection();
      }
   }
}
