import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

class mxj$a implements TableCellRenderer {
   mxj$a(mxj var1) {
      this.ETL = var1;
   }

   @Override
   public Component getTableCellRendererComponent(JTable var1, Object var2, boolean var3, boolean var4, int var5, int var6) {
      dta var7 = ((mxl)var1.getModel()).afS(var5);
      JCheckBox var8 = null;
      if (var6 == 4) {
         var8 = (JCheckBox)mxj.eSU().get(var7.getGUID());
         if (var8 == null) {
            var8 = new JCheckBox("");
            var8.setSelected(true);
            mxj.eSU().put(var7.getGUID(), var8);
         }
      } else if (var6 == 5) {
         var8 = (JCheckBox)mxj.cnw().get(var7.getGUID());
         if (var8 == null) {
            var8 = new JCheckBox("");
            var8.setSelected(false);
            mxj.cnw().put(var7.getGUID(), var8);
         }
      }

      return var8;
   }
}
