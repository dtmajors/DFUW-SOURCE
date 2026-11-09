import javax.swing.table.AbstractTableModel;

class mrz$b extends AbstractTableModel {
   private mrz$b(mrz var1) {
      this.EoW = var1;
   }

   @Override
   public int getColumnCount() {
      return 1;
   }

   @Override
   public int getRowCount() {
      return mrz.a(this.EoW).size();
   }

   @Override
   public Object getValueAt(int var1, int var2) {
      return mrz.b(this.EoW)[mrz.a(this.EoW).get(var1)].getName();
   }
}
