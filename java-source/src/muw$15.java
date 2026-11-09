import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.tree.DefaultMutableTreeNode;

class muw$15 implements ActionListener {
   muw$15(muw var1) {
      this.EJb = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int[] var2 = muw.f(this.EJb).getSelectionRows();
      if (var2 != null) {
         DefaultMutableTreeNode var3 = (DefaultMutableTreeNode)muw.f(this.EJb).getLastSelectedPathComponent();
         if (var3.isLeaf()) {
            String var4 = var3.toString();
            muw.g(this.EJb).setText(var4);
            muw.a(this.EJb, var4);
         }
      }
   }
}
