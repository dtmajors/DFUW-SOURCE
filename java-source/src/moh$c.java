import java.awt.Component;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

class moh$c extends JLabel implements TableCellRenderer {
   public moh$c(moh var1) {
      this.DSw = var1;
   }

   @Override
   public Component getTableCellRendererComponent(JTable var1, Object var2, boolean var3, boolean var4, int var5, int var6) {
      this.setIcon((ImageIcon)var2);
      return this;
   }

   @Override
   public void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      var1.drawImage(((ImageIcon)this.getIcon()).getImage(), 0, 0, this.getWidth(), this.getHeight(), null);
   }
}
