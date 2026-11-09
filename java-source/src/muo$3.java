import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.tree.DefaultMutableTreeNode;

class muo$3 implements ActionListener {
   muo$3(muo var1) {
      this.EHi = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      if (!muo.g(this.EHi).isSelectionEmpty()) {
         int[] var2 = muo.g(this.EHi).getSelectionRows();
         if (var2 != null) {
            DefaultMutableTreeNode var3 = (DefaultMutableTreeNode)muo.g(this.EHi).getLastSelectedPathComponent();
            System.out.println("Selected Node :" + var3.getUserObject());
            muo.b(this.EHi, var3.getUserObject().toString());
         }
      }
   }
}
