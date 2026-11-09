import javax.swing.table.AbstractTableModel;

class mld$4 extends AbstractTableModel {
   mld$4(mld var1) {
      this.DHD = var1;
   }

   @Override
   public int getColumnCount() {
      return 5;
   }

   @Override
   public int getRowCount() {
      return this.DHD.DHf.size();
   }

   @Override
   public Object getValueAt(int var1, int var2) {
      mld$c var3 = (mld$c)this.DHD.DHf.get(var1);
      if (var2 == 0) {
         return var3.DHJ;
      } else if (var2 == 1) {
         return var3.DHH.pa();
      } else if (var2 == 2) {
         return Integer.toString(var3.DHH.dpS) + "-" + Integer.toString(var3.DHH.dpT);
      } else if (var2 == 3) {
         return var3.DHH.Probability;
      } else if (var2 == 4) {
         return var3.DHI ? "Skin" : "Loot";
      } else {
         return "blah";
      }
   }
}
