import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;

class mrz$12 extends DefaultTreeCellRenderer {
   mrz$12(mrz var1) {
      this.EoW = var1;
   }

   @Override
   public Component getTreeCellRendererComponent(JTree var1, Object var2, boolean var3, boolean var4, boolean var5, int var6, boolean var7) {
      Component var8 = super.getTreeCellRendererComponent(var1, var2, var3, var4, var5, var6, var7);
      if (var8 instanceof JLabel && var2 instanceof DefaultMutableTreeNode) {
         DefaultMutableTreeNode var9 = (DefaultMutableTreeNode)var2;
         if (var9.getUserObject() != null && var9.getUserObject() instanceof mrz$d) {
            mrz$d var10 = (mrz$d)var9.getUserObject();
            if (var10.eMZ() == null) {
               JLabel var11 = (JLabel)var8;
               if (mrz.d(this.EoW) == null) {
                  mrz.a(this.EoW, new ImageIcon(lcw.qLb + "worldbuilder/icons/" + "silk/lightning.gif"));
               }

               var11.setIcon(mrz.d(this.EoW));
            }
         }
      }

      return var8;
   }
}
