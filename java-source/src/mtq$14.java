import java.util.Vector;
import javax.swing.table.DefaultTableModel;

class mtq$14 extends DefaultTableModel {
   mtq$14(mtq var1, Vector var2, Vector var3) {
      super(var2, var3);
      this.EBi = var1;
   }

   @Override
   public boolean isCellEditable(int var1, int var2) {
      return false;
   }
}
