import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

class mlm$1 extends DefaultTableCellRenderer {
   mlm$1(mlm var1) {
      this.DJc = var1;
   }

   @Override
   public Component getTableCellRendererComponent(JTable var1, Object var2, boolean var3, boolean var4, int var5, int var6) {
      if (var6 == 0) {
         if (var2 instanceof JCheckBox) {
            return (JCheckBox)var2;
         }

         if (var2 instanceof Boolean) {
            lfn.b(5, ".getTableCellRendererComponent()", "boolean... madness!");
         }
      }

      return super.getTableCellRendererComponent(var1, var2, var3, var4, var5, var6);
   }
}
