import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class msc$1 implements ListSelectionListener {
   msc$1(msc var1) {
      this.EpP = var1;
   }

   @Override
   public void valueChanged(ListSelectionEvent var1) {
      msc.a(this.EpP, var1);
   }
}
