import javax.swing.AbstractListModel;

class msc$3 extends AbstractListModel {
   String[] qos;

   msc$3(msc var1) {
      this.EpP = var1;
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
