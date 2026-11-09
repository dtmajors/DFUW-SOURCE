import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.tree.DefaultMutableTreeNode;

class mtm$20 implements ActionListener {
   mtm$20(mtm var1) {
      this.Ezt = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int[] var2 = mtm.B(this.Ezt).getSelectionRows();
      if (var2 != null) {
         DefaultMutableTreeNode var3 = (DefaultMutableTreeNode)mtm.B(this.Ezt).getLastSelectedPathComponent();
         if (var3.isLeaf()) {
            String var4 = var3.toString();
            if (!mtm.C(this.Ezt).contains(var4)) {
               mtm.a(this.Ezt, var4);
            }
         }
      }
   }
}
