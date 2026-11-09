import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

class mma$a extends JLabel implements TableCellRenderer {
   public mma$a(mma var1) {
      this.DLY = var1;
      this.setOpaque(true);
   }

   @Override
   public Component getTableCellRendererComponent(JTable var1, Object var2, boolean var3, boolean var4, int var5, int var6) {
      mmb var7 = ((mmc)var1.getModel()).aeP(var5);
      if (!var3) {
         this.setBackground(Color.white);
      }

      if (!var7.eFi().equals(var7.eFj())) {
         this.setBackground(Color.red);
      }

      if (var7.eFj().equals("n/a")) {
         this.setBackground(Color.orange);
      }

      String var8 = var2 == null ? "null" : var2.toString();
      this.setText(var8);
      if (var3) {
         this.setBackground(Color.lightGray);
      }

      return this;
   }
}
