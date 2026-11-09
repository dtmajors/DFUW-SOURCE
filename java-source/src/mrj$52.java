import javax.swing.AbstractListModel;

class mrj$52 extends AbstractListModel {
   mrj$52(mrj var1) {
      this.EkK = var1;
   }

   @Override
   public Object getElementAt(int var1) {
      return ((dqu)mrj.e(this.EkK).get(var1)).DisplayName;
   }

   @Override
   public int getSize() {
      return mrj.e(this.EkK).size();
   }
}
