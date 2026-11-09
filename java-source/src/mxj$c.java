import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

class mxj$c extends JLabel implements TableCellRenderer {
   public mxj$c(mxj var1) {
      this.ETL = var1;
      this.setOpaque(true);
   }

   @Override
   public Component getTableCellRendererComponent(JTable var1, Object var2, boolean var3, boolean var4, int var5, int var6) {
      dta var7 = ((mxl)var1.getModel()).afS(var5);
      if (!var3) {
         this.setBackground(Color.white);
      }

      if (!var7.isActive()) {
         this.setBackground(Color.orange);
      }

      if (var7.isLocked()) {
         this.setBackground(Color.red);
      }

      switch (var7.bzz()) {
         case 2:
            this.setBackground(new Color(1.0F, 0.8F, 0.8F));
            break;
         case 3:
            this.setBackground(new Color(0.7F, 0.7F, 1.0F));
         case 4:
         case 6:
         case 8:
         case 10:
         case 11:
         case 12:
         default:
            break;
         case 5:
            this.setBackground(new Color(0.8F, 0.8F, 1.0F));
            break;
         case 7:
            this.setBackground(Color.ORANGE);
            break;
         case 9:
            this.setBackground(Color.GREEN);
            break;
         case 13:
            this.setBackground(new Color(1.0F, 1.0F, 0.55F));
      }

      String var8 = var2 == null ? "null" : var2.toString();
      this.setText(var8);
      if (var3) {
         this.setBackground(Color.magenta);
      }

      return this;
   }
}
