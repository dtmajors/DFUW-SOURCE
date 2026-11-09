import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.tree.TreePath;

class lat$4 extends AbstractAction {
   lat$4(lat var1, String var2) {
      super(var2);
      this.qtL = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      TreePath var2 = this.qtL.qtO.getSelectionModel().getSelectionPath();
      if (var2 != null) {
         int var3 = JOptionPane.showConfirmDialog(this.qtL, "Do you really want to delete the node", "Deletion confirmation", 0);
         if (var3 != 1) {
            lae var4 = (lae)var2.getLastPathComponent();
            lfn.b(0, "SFXMLSpecialEffectTreeView.DeleteNode", "actionPerformed() Removing node '" + var4.getName() + "' and its descendants.");
            lae var5 = (lae)var4.getParent();
            switch (var4.getNodeType()) {
               case 19:
                  dgj var9 = (dgj)var4.getValue();
                  lat.c(this.qtL).remove(new Integer(var9.getSpecialEffectType()));
                  del.n(var9.getSpecialEffectName(), var9.getSpecialEffectType());
                  this.qtL.qoZ.a(null, false);
                  break;
               case 21:
                  dgj var6 = (dgj)var5.getValue();
                  dkw var7 = var6.getContainerManager();
                  if (var7 == null) {
                     lfn.b(
                        5,
                        "SFXMLSpecialEffectTreeView.DeleteNode",
                        "actionPerformed() Effect '" + var6.getSpecialEffectName() + "' has subeffect but no containermanager."
                     );
                     return;
                  }

                  dgj var8 = (dgj)var4.getValue();
                  var7.f(var8);
                  if (var7.bnY() == null || var7.bnY().length == 0) {
                     var6.setContainerManager(null);
                  }

                  this.qtL.qoZ.a(null, true);
                  break;
               default:
                  return;
            }

            this.qtL.qtP.removeNodeFromParent(var4);
         }
      }
   }
}
