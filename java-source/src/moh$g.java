import java.awt.Component;
import javax.swing.JSlider;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

class moh$g extends JSlider implements TableCellRenderer {
   public moh$g(moh var1) {
      this.DSw = var1;
   }

   @Override
   public Component getTableCellRendererComponent(JTable var1, Object var2, boolean var3, boolean var4, int var5, int var6) {
      this.setValue(var2 instanceof Number ? ((Number)var2).intValue() : 0);
      return this;
   }
}
