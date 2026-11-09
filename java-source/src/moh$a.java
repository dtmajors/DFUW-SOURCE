import java.awt.Color;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.TableCellRenderer;

class moh$a extends JLabel implements TableCellRenderer {
   Border DSy;
   Border DSz;
   boolean DSA;

   public moh$a(moh var1, boolean var2) {
      this.DSw = var1;
      this.DSy = null;
      this.DSz = null;
      this.DSA = true;
      this.DSA = var2;
      this.setOpaque(true);
   }

   @Override
   public Component getTableCellRendererComponent(JTable var1, Object var2, boolean var3, boolean var4, int var5, int var6) {
      this.setBackground((Color)var2);
      if (this.DSA) {
         if (var3) {
            if (this.DSz == null) {
               this.DSz = BorderFactory.createMatteBorder(2, 5, 2, 5, var1.getSelectionBackground());
            }

            this.setBorder(this.DSz);
         } else {
            if (this.DSy == null) {
               this.DSy = BorderFactory.createMatteBorder(2, 5, 2, 5, var1.getBackground());
            }

            this.setBorder(this.DSy);
         }
      }

      return this;
   }
}
