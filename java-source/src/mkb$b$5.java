import javax.swing.ListModel;
import javax.swing.event.ListDataListener;

class mkb$b$5 implements ListModel {
   mkb$b$5(mkb$b var1) {
      this.DFa = var1;
   }

   @Override
   public void addListDataListener(ListDataListener var1) {
   }

   @Override
   public Object getElementAt(int var1) {
      String var2 = (String)mkb.g(this.DFa.DEO).get(var1);
      return var2.length() >= 15 ? var2.substring(var2.length() - 15, var2.length()) : var2;
   }

   @Override
   public int getSize() {
      return mkb.g(this.DFa.DEO).size();
   }

   @Override
   public void removeListDataListener(ListDataListener var1) {
   }
}
