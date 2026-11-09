import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.tree.TreePath;

class lar$2 extends AbstractAction {
   lar$2(lar var1, String var2) {
      super(var2);
      this.qtw = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      TreePath var2 = this.qtw.qtO.getSelectionModel().getSelectionPath();
      if (var2 != null) {
         lae var3 = (lae)var2.getLastPathComponent();
         if (var3.isNodeAncestor(this.qtw.qtR)) {
            this.qtw.qtP.removeNodeFromParent(var3);
            this.qtw.qoZ.ym(var3.getName());
         } else {
            int var4 = this.qtw.aqN.getType(var3.getName());
            ler var5 = this.qtw.aqN.acv(var4);
            this.qtw.aqN.j(var5);
            this.qtw.qtP.removeNodeFromParent(var3);
            this.qtw.qtR.add(var3);
            this.qtw.qtP.reload(this.qtw.qtR);
         }
      }
   }
}
