import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.tree.TreePath;

class lam$3 extends AbstractAction {
   lam$3(lam var1, String var2) {
      super(var2);
      this.qsP = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      TreePath var2 = this.qsP.qtO.getSelectionModel().getSelectionPath();
      if (var2 != null && !this.qsP.c((lae)var2.getLastPathComponent())) {
         int var3 = JOptionPane.showConfirmDialog(this.qsP, "Do you really want to delete the node", "Deletion confirmation", 0);
         if (var3 != 1) {
            lae var4 = (lae)var2.getLastPathComponent();
            if (var4.getNodeType() == 12) {
               ctu var5 = (ctu)var4.getValue();
               lam.b(this.qsP).remove(new Integer(var5.az()));
               this.qsP.qtP.removeNodeFromParent(var4);
               lfn.b(0, "SFXMLRecipeTreeView.DeleteNode", "actionPerformed() Removed " + var5);
            } else if (var4.getNodeType() == 13) {
               ctv var8 = (ctv)var4.getValue();
               lam.c(this.qsP).remove(new Integer(var8.Ps));
               lam.c(this.qsP).remove(var8.fJ());
               this.qsP.qtP.removeNodeFromParent(var4);
               lfn.b(0, "SFXMLRecipeTreeView.DeleteNode", "actionPerformed() Removed " + var8);
            } else if (var4.getNodeType() == 7) {
               ctm var9 = (ctm)var4.getValue();
               lae var6 = (lae)var4.getParent();
               ctt var7 = (ctt)var6.getValue();
               if (!var7.b(var9)) {
                  return;
               }

               this.qsP.qtP.removeNodeFromParent(var4);
               lfn.b(0, "SFXMLRecipeTreeView.DeleteNode", "actionPerformed() Removed " + var9);
            } else if (var4.getNodeType() == 14) {
               ctz var10 = (ctz)var4.getValue();
               lae var12 = (lae)var4.getParent();
               ctu var14 = (ctu)var12.getValue();
               if (!var14.b(var10)) {
                  return;
               }

               this.qsP.qtP.removeNodeFromParent(var4);
               lfn.b(0, "SFXMLRecipeTreeView.DeleteNode", "actionPerformed() Removed " + var10);
            } else if (var4.getNodeType() == 5) {
               all var11 = (all)var4.getValue();
               lae var13 = (lae)var4.getParent();
               ctv var15 = (ctv)var13.getValue();
               this.qsP.qtP.removeNodeFromParent(var4);
               lfn.b(0, "SFXMLRecipeTreeView.DeleteNode", "actionPerformed() Removed " + var11);
            }
         }
      }
   }
}
