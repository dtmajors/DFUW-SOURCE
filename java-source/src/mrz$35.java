import javax.swing.AbstractListModel;

class mrz$35 extends AbstractListModel {
   mrz$35(mrz var1) {
      this.EoW = var1;
   }

   @Override
   public Object getElementAt(int var1) {
      return mrz.y(this.EoW).get(var1);
   }

   @Override
   public int getSize() {
      return mrz.y(this.EoW).size();
   }
}
