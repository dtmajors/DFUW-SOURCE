import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

class mwg$b extends JLabel implements TableCellRenderer {
   public mwg$b(mwg var1) {
      this.EPd = var1;
      this.setOpaque(true);
   }

   @Override
   public Component getTableCellRendererComponent(JTable var1, Object var2, boolean var3, boolean var4, int var5, int var6) {
      amf var7 = ((mwi)var1.getModel()).afJ(var5);
      if (!var3) {
         this.setBackground(Color.white);
      }

      if (var7 == null) {
         this.setBackground(Color.red);
         this.setText("---INVALID---");
         return this;
      }

      switch (var7.getObjectType()) {
         case 28:
            this.setBackground(new Color(0.3F, 1.0F, 0.3F));
            break;
         case 41:
            this.setBackground(new Color(0.7F, 0.7F, 0.7F));
      }

      String var8 = var2 == null ? "null" : var2.toString();
      this.setText(var8);
      if (var3) {
         this.setBackground(Color.magenta);
      }

      return this;
   }
}
