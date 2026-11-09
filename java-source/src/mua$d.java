import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

class mua$d extends JLabel implements ListCellRenderer {
   public mua$d(mua var1) {
      this.EFo = var1;
      this.setOpaque(true);
   }

   @Override
   public Component getListCellRendererComponent(JList var1, Object var2, int var3, boolean var4, boolean var5) {
      if (var2 == null) {
         this.setText("");
         return this;
      }

      ctn var6 = lea.eoK().get(var2.toString());
      if (var6 != null) {
         String var7 = var6.Name;
         if (var6.fgd > -1) {
            var7 = var7 + ", MinRank:" + var6.fgd;
         }

         if (var6.fge > -1) {
            var7 = var7 + ", MaxRank:" + var6.fge;
         }

         this.setText(var7);
      } else {
         this.setText(var2.toString());
      }

      if (var4) {
         this.setForeground(var1.getSelectionForeground());
         this.setBackground(var1.getSelectionBackground());
      } else {
         this.setForeground(var1.getForeground());
         this.setBackground(var1.getBackground());
      }

      return this;
   }
}
