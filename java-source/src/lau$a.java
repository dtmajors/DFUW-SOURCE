import java.awt.Component;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreePath;

class lau$a extends DefaultTreeCellRenderer {
   lau$a(lau var1) {
      this.quf = var1;
   }

   @Override
   public Component getTreeCellRendererComponent(JTree var1, Object var2, boolean var3, boolean var4, boolean var5, int var6, boolean var7) {
      super.getTreeCellRendererComponent(var1, var2, var3, var4, var5, var6, var7);
      TreePath var8 = this.quf.qtO.getSelectionModel().getSelectionPath();
      if (var8 != null) {
         lae var9 = (lae)var8.getLastPathComponent();
         this.setToolTipText(var9.getToolTipText());
      } else {
         this.setToolTipText(null);
      }

      return this;
   }
}
