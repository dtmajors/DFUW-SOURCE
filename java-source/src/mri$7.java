import javax.swing.AbstractListModel;

class mri$7 extends AbstractListModel {
   mri$7(mri var1) {
      this.Ejc = var1;
   }

   @Override
   public Object getElementAt(int var1) {
      if (mri.g(this.Ejc) != null && var1 >= 0 && var1 < mri.g(this.Ejc).length) {
         mrk var2 = (mrk)mri.h(this.Ejc).get(mri.g(this.Ejc)[var1]);
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
