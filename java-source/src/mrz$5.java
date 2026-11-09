import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class mrz$5 implements ListSelectionListener {
   mrz$5(mrz var1, JTable var2) {
      this.EoW = var1;
      this.EoX = var2;
   }

   @Override
   public void valueChanged(ListSelectionEvent var1) {
      int var2 = this.EoX.getSelectedRow();
      if (var2 != -1) {
         Integer var3 = (Integer)mrz.a(this.EoW).get(var2);
         if (var3 >= 0 && var3 < mrz.b(this.EoW).length) {
            int var4 = del.dr(mrz.b(this.EoW)[var3].getName());
            mrz.a(this.EoW, var4);
            mrz.m(this.EoW).clearSelection();
         } else {
            lfn.b(5, this.getClass().getName(), "createEffectListPanel() : filtered selection out of range");
         }
      }
   }
}
