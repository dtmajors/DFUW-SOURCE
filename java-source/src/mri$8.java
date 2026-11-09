import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class mri$8 implements ListSelectionListener {
   mri$8(mri var1) {
      this.Ejc = var1;
   }

   @Override
   public void valueChanged(ListSelectionEvent var1) {
      mri.b(this.Ejc);
   }
}
