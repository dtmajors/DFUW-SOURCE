import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.tree.DefaultMutableTreeNode;

class mtu$7 implements ActionListener {
   mtu$7(mtu var1) {
      this.EDB = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int[] var2 = mtu.f(this.EDB).getSelectionRows();
      if (var2 != null) {
         DefaultMutableTreeNode var3 = (DefaultMutableTreeNode)mtu.f(this.EDB).getLastSelectedPathComponent();
         if (var3.isLeaf()) {
            String var4 = var3.toString();
            if (!mtu.d(this.EDB).containsKey(var4)) {
               int var5 = lea.enW().getType(var4);
               cur var6 = new cur(var5, 0.0F, 0.0F, 0.0F, -1, 0.0F, -1, 0.0F);
               mtu.d(this.EDB).put(var4, var6);
               lil var7 = mtu.a(this.EDB, var4, var6);
               mtu.g(this.EDB).put(var6, var7);
            }
         }
      }
   }
}
