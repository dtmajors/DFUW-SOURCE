import java.awt.Color;
import java.awt.Component;
import java.util.Set;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

class mua$b extends JLabel implements ListCellRenderer {
   public mua$b(mua var1) {
      this.EFo = var1;
      this.setOpaque(true);
   }

   @Override
   public Component getListCellRendererComponent(JList var1, Object var2, int var3, boolean var4, boolean var5) {
      if (var2 == null) {
         this.setText("");
         return this;
      }

      this.setText(var2.toString());
      if (var2.toString().equals("[--No Tags--]")) {
         this.setForeground(Color.lightGray);
      } else {
         Set var6 = lea.eoK().keySet();
         this.setForeground(var6.contains(var2) ? Color.black : Color.red);
         this.setToolTipText(var6.contains(var2) ? null : "Tag does not exist");
      }

      if (var4) {
         this.setBackground(var1.getSelectionBackground());
      } else {
         this.setBackground(var1.getBackground());
      }

      return this;
   }
}
