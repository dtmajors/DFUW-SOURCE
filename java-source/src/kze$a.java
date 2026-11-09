import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

class kze$a extends JLabel implements ListCellRenderer {
   public kze$a(kze var1) {
      this.qnG = var1;
      this.setOpaque(true);
   }

   @Override
   public Component getListCellRendererComponent(JList var1, Object var2, int var3, boolean var4, boolean var5) {
      this.setText(var2.toString());
      if (var4) {
         this.setBackground(kze.b(this.qnG));
      } else if (kze.c(this.qnG) != null && var3 >= 0 && kze.c(this.qnG)[var3]) {
         this.setBackground(kze.d(this.qnG));
      } else {
         this.setBackground(Color.white);
      }

      return this;
   }
}
