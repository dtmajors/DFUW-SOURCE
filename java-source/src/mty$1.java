import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;

class mty$1 implements ListDataListener {
   mty$1(mty var1) {
      this.EET = var1;
   }

   @Override
   public void intervalRemoved(ListDataEvent var1) {
      mty.a(this.EET);
   }

   @Override
   public void intervalAdded(ListDataEvent var1) {
      mty.a(this.EET);
   }

   @Override
   public void contentsChanged(ListDataEvent var1) {
      mty.a(this.EET);
   }
}
