import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class mua$9 implements ListSelectionListener {
   mua$9(mua var1) {
      this.EFo = var1;
   }

   @Override
   public void valueChanged(ListSelectionEvent var1) {
      this.EFo.c(var1);
   }
}
