import javax.swing.AbstractListModel;

class mkw$1 extends AbstractListModel {
   String[] qos;

   mkw$1(mkw var1) {
      this.DFX = var1;
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
