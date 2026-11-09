import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreePath;

class mrf$3 extends MouseAdapter {
   mrf$3(mrf var1) {
      this.EiE = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (var1.getButton() == 1 && var1.getClickCount() == 2) {
         TreePath var2 = this.EiE.Eix.getSelectionPath();
         if (var2 != null) {
            MutableTreeNode var3 = (MutableTreeNode)var2.getLastPathComponent();
            if (var3 != null) {
               mrf.a(this.EiE, var3.toString());
            }
         }
      }
   }
}
