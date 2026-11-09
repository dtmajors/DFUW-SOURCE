import javax.swing.AbstractListModel;

class mrj$38 extends AbstractListModel {
   mrj$38(mrj var1) {
      this.EkK = var1;
   }

   @Override
   public Object getElementAt(int var1) {
      return ((dqz)mrj.E(this.EkK).get(var1)).getName();
   }

   @Override
   public int getSize() {
      return mrj.E(this.EkK).size();
   }
}
