import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.tree.DefaultMutableTreeNode;

class mxc$5 extends MouseAdapter {
   mxc$5(mxc var1) {
      this.ESh = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (var1.getButton() == 1 && var1.getClickCount() == 2) {
         int[] var2 = mxc.c(this.ESh).getSelectionRows();
         if (var2 != null) {
            DefaultMutableTreeNode var3 = (DefaultMutableTreeNode)mxc.c(this.ESh).getLastSelectedPathComponent();
            if (var3.isLeaf()) {
               String var4 = var3.toString();
               this.ESh.addItem(var4);
            }
         }
      }
   }
}
