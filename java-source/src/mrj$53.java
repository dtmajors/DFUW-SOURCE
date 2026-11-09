import javax.swing.AbstractListModel;

class mrj$53 extends AbstractListModel {
   mrj$53(mrj var1) {
      this.EkK = var1;
   }

   @Override
   public Object getElementAt(int var1) {
      Integer[] var2 = new Integer[mrj.f(this.EkK).size()];
      var2 = mrj.f(this.EkK).toArray(var2);
      dqu var3 = (dqu)dqx.buI().get(var2[var1]);
      return var3 != null ? var3.DisplayName : "error";
   }

   @Override
   public int getSize() {
      return mrj.f(this.EkK).size();
   }
}
