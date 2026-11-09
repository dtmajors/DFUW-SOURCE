import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.tree.TreePath;

class lac$2 extends AbstractAction {
   lac$2(lac var1, String var2) {
      super(var2);
      this.qqM = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      TreePath var2 = this.qqM.qtO.getSelectionModel().getSelectionPath();
      if (var2 != null) {
         int var3 = JOptionPane.showConfirmDialog(this.qqM, "Do you really want to delete the node", "Deletion confirmation", 0);
         if (var3 != 1) {
            lae var4 = (lae)var2.getLastPathComponent();
            lfn.b(1, "SFXMLFunctionTreeView", "actionPerformed() Removing node " + var4.getName() + " and its descendants.");
            int var5 = this.qqM.dqt.getType(var4.getName());
            ler var6 = this.qqM.dqt.acv(var5);
            this.qqM.dqt.j(var6);
            this.qqM.qtP.removeNodeFromParent(var4);
            this.qqM.qoZ.yk(var4.getName());
         }
      }
   }
}
