import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class mwg$2 implements ListSelectionListener {
   mwg$2(mwg var1) {
      this.EPd = var1;
   }

   @Override
   public void valueChanged(ListSelectionEvent var1) {
      if (!var1.getValueIsAdjusting()) {
         ListSelectionModel var2 = (ListSelectionModel)var1.getSource();
         if (!var2.isSelectionEmpty()) {
            mwg.a(this.EPd);
         }
      }
   }
}
