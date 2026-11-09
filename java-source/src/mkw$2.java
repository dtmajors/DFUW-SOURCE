import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class mkw$2 implements ListSelectionListener {
   mkw$2(mkw var1) {
      this.DFX = var1;
   }

   @Override
   public void valueChanged(ListSelectionEvent var1) {
      mkw.a(this.DFX, var1);
   }
}
