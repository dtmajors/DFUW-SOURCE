import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

class mrz$23 implements TreeSelectionListener {
   mrz$23(mrz var1) {
      this.EoW = var1;
   }

   @Override
   public void valueChanged(TreeSelectionEvent var1) {
      DefaultMutableTreeNode var2 = (DefaultMutableTreeNode)var1.getPath().getLastPathComponent();
      mrz$d var3 = (mrz$d)var2.getUserObject();
      if (var3 != null) {
         this.EoW.a(var3);
      }
   }
}
