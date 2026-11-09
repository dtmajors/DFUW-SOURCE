import javax.swing.AbstractListModel;

class mlz$4 extends AbstractListModel {
   mlz$4(mlz var1) {
      this.DLU = var1;
   }

   @Override
   public Object getElementAt(int var1) {
      return mlz.a(this.DLU).get(var1);
   }

   @Override
   public int getSize() {
      return mlz.a(this.DLU).size();
   }
}
