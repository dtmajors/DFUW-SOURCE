import java.awt.Color;
import java.awt.Component;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellRenderer;

class laa$a extends DefaultTreeCellRenderer {
   private Color qqp;
   private Color qov;

   public laa$a(laa var1) {
      this.qqo = var1;
      this.qqp = new Color(0, 200, 0);
      this.qov = Color.black;
   }

   @Override
   public Component getTreeCellRendererComponent(JTree var1, Object var2, boolean var3, boolean var4, boolean var5, int var6, boolean var7) {
      int var8 = ((lae)var2).getType();
      ldi var9 = (ldi)this.qqo.DX.acv(var8);
      if (var9 != null && var9.enn()) {
         this.setTextSelectionColor(this.qqp);
         this.setTextNonSelectionColor(this.qqp);
      } else {
         this.setTextSelectionColor(this.qov);
         this.setTextNonSelectionColor(this.qov);
      }

      super.getTreeCellRendererComponent(var1, var2, var3, var4, var5, var6, var7);
      return this;
   }
}
