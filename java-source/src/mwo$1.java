import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class mwo$1 implements ListSelectionListener {
   mwo$1(mwo var1) {
      this.ERN = var1;
   }

   @Override
   public void valueChanged(ListSelectionEvent var1) {
      mwo.a(this.ERN, var1);
   }
}
