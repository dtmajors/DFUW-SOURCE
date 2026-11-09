import java.awt.Color;
import java.awt.Component;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellRenderer;

class h$b extends DefaultTreeCellRenderer {
   public h$b(h var1) {
      this.cl = var1;
      this.setOpaque(true);
   }

   @Override
   public Component getTreeCellRendererComponent(JTree var1, Object var2, boolean var3, boolean var4, boolean var5, int var6, boolean var7) {
      this.selected = var3;
      if (var5) {
         this.setText(var2.toString());
      } else {
         this.setText("() " + var2.toString());
      }

      if (!var1.isEnabled()) {
         this.setEnabled(false);
         if (var5) {
            this.setDisabledIcon(this.getLeafIcon());
         } else if (var4) {
            this.setDisabledIcon(this.getOpenIcon());
         } else {
            this.setDisabledIcon(this.getClosedIcon());
         }
      } else {
         this.setEnabled(true);
         if (var5) {
            this.setIcon(this.getLeafIcon());
         } else if (var4) {
            this.setIcon(this.getOpenIcon());
         } else {
            this.setIcon(this.getClosedIcon());
         }
      }

      this.setComponentOrientation(var1.getComponentOrientation());
      if (var3) {
         this.setBackground(Color.lightGray);
      } else {
         this.setBackground(Color.white);
      }

      if (var2 instanceof lae) {
         lae var8 = (lae)var2;
         if (var8.isLeaf()) {
            lgw var9 = (lgw)var8.dHM();
            if (var9 != null) {
               if (var9.erK()) {
                  this.setForeground(Color.blue);
               } else {
                  this.setForeground(Color.red);
               }
            } else {
               this.setForeground(Color.black);
            }
         } else {
            this.setForeground(Color.black);
         }
      }

      return this;
   }
}
