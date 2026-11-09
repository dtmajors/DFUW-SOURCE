import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.tree.DefaultMutableTreeNode;

class mtt$14 implements ActionListener {
   mtt$14(mtt var1) {
      this.EDj = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int[] var2 = mtt.n(this.EDj).getSelectionRows();
      if (var2 != null) {
         DefaultMutableTreeNode var3 = (DefaultMutableTreeNode)mtt.n(this.EDj).getLastSelectedPathComponent();
         if (var3.isLeaf()) {
            String var4 = var3.toString();
            if (mtt.i(this.EDj).isVisible()) {
               if (!mtt.o(this.EDj).contains(var4)) {
                  mtt.a(this.EDj, var4);
               }
            } else {
               mtt.b(this.EDj, var4);
            }
         }
      }
   }
}
