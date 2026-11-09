import java.awt.Color;
import java.awt.Component;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellRenderer;

class lao$a extends DefaultTreeCellRenderer {
   private Color qtd;
   private Color qov;

   public lao$a(lao var1) {
      this.qtc = var1;
      this.qtd = new Color(0, 200, 0);
      this.qov = Color.black;
   }

   @Override
   public Component getTreeCellRendererComponent(JTree var1, Object var2, boolean var3, boolean var4, boolean var5, int var6, boolean var7) {
      int var8 = ((lae)var2).getType();
      lgw var9 = (lgw)this.qtc.ResourceTree.acv(var8);
      if (var9.erK()) {
         this.setTextSelectionColor(this.qtd);
         this.setTextNonSelectionColor(this.qtd);
      } else {
         this.setTextSelectionColor(this.qov);
         this.setTextNonSelectionColor(this.qov);
      }

      super.getTreeCellRendererComponent(var1, var2, var3, var4, var5, var6, var7);
      return this;
   }
}
