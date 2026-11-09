import javax.swing.ListModel;
import javax.swing.event.ListDataListener;

class mqy$5 implements ListModel {
   mqy$5(mqy var1) {
      this.Ehw = var1;
   }

   @Override
   public void addListDataListener(ListDataListener var1) {
   }

   @Override
   public Object getElementAt(int var1) {
      return "Point #" + (var1 + 1);
   }

   @Override
   public int getSize() {
      return mqy.c(this.Ehw).byb().size();
   }

   @Override
   public void removeListDataListener(ListDataListener var1) {
   }
}
