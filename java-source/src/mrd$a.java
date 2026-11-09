import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.tree.DefaultMutableTreeNode;

class mrd$a extends MouseAdapter {
   mrd$a(mrd var1) {
      this.EhY = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if ((var1.getModifiers() != 16 || var1.getClickCount() != 1) && var1.getModifiers() == 16 && var1.getClickCount() == 2) {
         DefaultMutableTreeNode var2 = (DefaultMutableTreeNode)mrd.a(this.EhY).getLastSelectedPathComponent();
         if (var2.isLeaf() || mrd.b(this.EhY)) {
            String var3 = var2.toString();
            lfn.b(0, this.getClass().getSimpleName(), "mouseClicked() : Setting node = " + var3);
            mrd.c(this.EhY).CU(var3);
            this.EhY.dispose();
         }
      }
   }
}
