import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class mkz$2 implements ListSelectionListener {
   mkz$2(mkz var1) {
      this.DGu = var1;
   }

   @Override
   public void valueChanged(ListSelectionEvent var1) {
      mkz.a(this.DGu, var1);
   }
}
