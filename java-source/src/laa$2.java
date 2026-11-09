import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.tree.TreePath;

class laa$2 extends AbstractAction {
   laa$2(laa var1, String var2) {
      super(var2);
      this.qqo = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      TreePath var2 = this.qqo.qtO.getSelectionModel().getSelectionPath();
      if (var2 != null) {
         lae var3 = (lae)var2.getLastPathComponent();
         lfn.b(1, "SFXMLEffectTreeView", "actionPerformed() Removing node " + var3.getName() + " and its descendants.");
         if (var3.isNodeAncestor(this.qqo.qtR)) {
            this.qqo.qtP.removeNodeFromParent(var3);
         } else {
            int var4 = this.qqo.DX.getType(var3.getName());
            ler var5 = this.qqo.DX.acv(var4);
            this.qqo.DX.j(var5);
            this.qqo.qtP.removeNodeFromParent(var3);
            this.qqo.qtR.add(var3);
            this.qqo.qtP.reload(this.qqo.qtR);
         }
      }
   }
}
