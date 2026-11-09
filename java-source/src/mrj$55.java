import javax.swing.AbstractListModel;

class mrj$55 extends AbstractListModel {
   mrj$55(mrj var1) {
      this.EkK = var1;
   }

   @Override
   public Object getElementAt(int var1) {
      if (mrj.c(this.EkK) != null && var1 >= 0 && var1 < mrj.c(this.EkK).length) {
         mrj$c var2 = (mrj$c)mrj.h(this.EkK).get(mrj.c(this.EkK)[var1]);
         return var2 == null ? "no glob mat at " + var1 : var1 + 1 + ":" + var2.DisplayName;
      } else {
         return "Material not loaded yet";
      }
   }

   @Override
   public int getSize() {
      return 8;
   }
}
