import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.tree.DefaultMutableTreeNode;

class mtr$15 implements ActionListener {
   mtr$15(mtr var1) {
      this.ECh = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int[] var2 = mtr.A(this.ECh).getSelectionRows();
      if (var2 != null) {
         DefaultMutableTreeNode var3 = (DefaultMutableTreeNode)mtr.A(this.ECh).getLastSelectedPathComponent();
         String var4 = var3.toString();
         mtr.B(this.ECh).setText(var4);
      }
   }
}
