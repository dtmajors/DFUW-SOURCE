import javax.swing.AbstractListModel;

class mrz$13 extends AbstractListModel {
   mrz$13(mrz var1) {
      this.EoW = var1;
   }

   @Override
   public Object getElementAt(int var1) {
      return del.zU((Integer)mrz.j(this.EoW).get(var1)) + "*";
   }

   @Override
   public int getSize() {
      return mrz.j(this.EoW).size();
   }
}
