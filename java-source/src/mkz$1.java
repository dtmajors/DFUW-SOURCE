import javax.swing.AbstractListModel;

class mkz$1 extends AbstractListModel {
   String[] qos;

   mkz$1(mkz var1) {
      this.DGu = var1;
      this.qos = new String[]{"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};
   }

   @Override
   public int getSize() {
      return this.qos.length;
   }

   @Override
   public Object getElementAt(int var1) {
      return this.qos[var1];
   }
}
