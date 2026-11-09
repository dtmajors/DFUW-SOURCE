import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellRenderer;

class mvc$b extends DefaultTreeCellRenderer {
   private Color EJG;
   private Color EJH;
   private Color EJI;
   private Color EJJ;
   private Color EJK;
   private Font EJL;

   public mvc$b(mvc var1) {
      this.EJE = var1;
      this.EJG = new Color(128, 0, 64);
      this.EJH = new Color(65, 110, 245);
      this.EJI = new Color(0, 128, 128);
      this.EJJ = Color.black;
      this.EJK = Color.black;
      this.EJL = new Font("Helvetica", 1, 14);
      this.setFont(this.EJL);
      this.setLeafIcon(null);
      this.setClosedIcon(null);
      this.setOpenIcon(null);
      this.setBackgroundSelectionColor(Color.lightGray);
   }

   @Override
   public Component getTreeCellRendererComponent(JTree var1, Object var2, boolean var3, boolean var4, boolean var5, int var6, boolean var7) {
      int var8 = ((cc)var2).getNodeType();
      if (var8 == 1) {
         if (var3) {
            this.setTextSelectionColor(this.EJG);
         } else {
            this.setTextNonSelectionColor(this.EJG);
         }
      } else if (var8 == 2) {
         if (var3) {
            this.setTextSelectionColor(this.EJH);
         } else {
            this.setTextNonSelectionColor(this.EJH);
         }
      } else if (var8 == 3) {
         if (var3) {
            this.setTextSelectionColor(this.EJI);
         } else {
            this.setTextNonSelectionColor(this.EJI);
         }
      } else if (var3) {
         this.setTextSelectionColor(this.EJK);
      } else {
         this.setTextNonSelectionColor(this.EJK);
      }

      return super.getTreeCellRendererComponent(var1, var2, var3, var4, var5, var6, var7);
   }
}
