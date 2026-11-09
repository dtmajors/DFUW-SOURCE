import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.tree.TreePath;

class kzu$2 extends AbstractAction {
   kzu$2(kzu var1, String var2) {
      super(var2);
      this.qoN = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      TreePath var2 = this.qoN.qtO.getSelectionModel().getSelectionPath();
      if (var2 != null) {
         int var3 = JOptionPane.showConfirmDialog(this.qoN, "Do you really want to delete the node", "Deletion confirmation", 0);
         if (var3 != 1) {
            lae var4 = (lae)var2.getLastPathComponent();
            int var5 = this.qoN.nOR.getType(var4.getName());
            ler var6 = this.qoN.nOR.acv(var5);
            this.qoN.nOR.j(var6);
            this.qoN.qtP.removeNodeFromParent(var4);
         }
      }
   }
}
