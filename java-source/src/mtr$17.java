import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;

class mtr$17 implements ActionListener {
   mtr$17(mtr var1) {
      this.ECh = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int[] var2 = mtr.C(this.ECh).getSelectionRows();
      if (var2 != null) {
         DefaultMutableTreeNode var3 = (DefaultMutableTreeNode)mtr.C(this.ECh).getLastSelectedPathComponent();
         if (var3.isLeaf()) {
            if (mtr.c(this.ECh) != null) {
               String var4 = var3.toString();
               mtr.D(this.ECh).setText(var4);
            } else {
               JOptionPane.showInternalMessageDialog(mtr.d(this.ECh), "Select A Missile Info Item First");
            }
         }
      }
   }
}
