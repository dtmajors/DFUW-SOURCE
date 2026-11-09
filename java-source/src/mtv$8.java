import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.tree.DefaultMutableTreeNode;

class mtv$8 extends MouseAdapter {
   mtv$8(mtv var1) {
      this.EEq = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (var1.getButton() == 1 && var1.getClickCount() == 2) {
         int[] var2 = mtv.c(this.EEq).getSelectionRows();
         if (var2 != null) {
            DefaultMutableTreeNode var3 = (DefaultMutableTreeNode)mtv.c(this.EEq).getLastSelectedPathComponent();
            if (var3.isLeaf()) {
               String var4 = var3.toString();
               mtv.a(this.EEq, var4, 1, 100);
            }
         }
      }
   }
}
