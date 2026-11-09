import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class mus$2 implements ListSelectionListener {
   mus$2(mus var1) {
      this.EHz = var1;
   }

   @Override
   public void valueChanged(ListSelectionEvent var1) {
      if (!var1.getValueIsAdjusting()) {
         ListSelectionModel var2 = (ListSelectionModel)var1.getSource();
         if (!var2.isSelectionEmpty()) {
            int var3 = var2.getMinSelectionIndex();
            mus.a(this.EHz, var3);
         }
      }
   }
}
