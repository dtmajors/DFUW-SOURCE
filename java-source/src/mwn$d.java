import java.awt.Component;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class mwn$d extends JComboBox implements TableCellRenderer {
   public mwn$d(mwn var1, Vector var2) {
      super(var2);
      this.ERI = var1;
   }

   @Override
   public Component getTableCellRendererComponent(JTable var1, Object var2, boolean var3, boolean var4, int var5, int var6) {
      this.setSelectedItem(var2);
      return this;
   }
}
