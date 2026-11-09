import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.tree.TreePath;

class lao$2 extends AbstractAction {
   lao$2(lao var1, String var2) {
      super(var2);
      this.qtc = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      TreePath var2 = this.qtc.qtO.getSelectionModel().getSelectionPath();
      if (var2 != null) {
         int var3 = JOptionPane.showConfirmDialog(this.qtc, "Do you really want to delete the resource", "Deletion confirmation", 0);
         if (var3 == 1) {
            return;
         }

         lae var4 = (lae)var2.getLastPathComponent();
         lfn.b(1, "SFXMLResourceTreeView", "actionPerformed() Removing node " + var4.getName() + " and its descendants.");
         if (var4.isNodeAncestor(this.qtc.qtR)) {
            this.qtc.qtP.removeNodeFromParent(var4);
            this.qtc.qoZ.yl(var4.getName());
         } else {
            int var5 = this.qtc.ResourceTree.getType(var4.getName());
            ler var6 = this.qtc.ResourceTree.acv(var5);
            this.qtc.ResourceTree.j(var6);
            this.qtc.qtP.removeNodeFromParent(var4);
            this.qtc.qtR.add(var4);
            this.qtc.qtP.reload(this.qtc.qtR);
         }
      }
   }
}
