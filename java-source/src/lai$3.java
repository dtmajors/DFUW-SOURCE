import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.tree.TreePath;

class lai$3 extends AbstractAction {
   lai$3(lai var1, String var2) {
      super(var2);
      this.qrW = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      TreePath var2 = this.qrW.qtO.getSelectionModel().getSelectionPath();
      if (var2 != null) {
         lae var3 = (lae)var2.getLastPathComponent();
         lfn.b(0, "SFXMLPaperDollTreeView.DeleteNode", "actionPerformed() Removing node '" + var3.getName() + "' and its descendants.");
         int var4 = JOptionPane.showConfirmDialog(this.qrW, "Are you sure you want to remove selected node", "RemoveNode", 0);
         if (var4 != 1) {
            lae var5 = (lae)var3.getParent();
            switch (var3.getNodeType()) {
               case 2:
               case 3:
               case 22:
                  cam var9 = (cam)var5.getValue();
                  if (var9.aGi().length == 1) {
                     return;
                  }

                  cai var10 = (cai)var3.getValue();
                  var9.c(var10);
                  this.qrW.qoZ.d(null);
                  break;
               case 8:
                  cai var8 = (cai)var5.getValue();
                  if (var8.aGa().length == 1) {
                     return;
                  }

                  cah var7 = (cah)var3.getValue();
                  var8.b(var7);
                  this.qrW.qoZ.d(null);
                  break;
               case 10:
               case 11:
                  can var6 = ((cam)var3.getValue()).aGl();
                  lai.c(this.qrW).remove(var6);
                  this.qrW.qoZ.b(null);
                  this.qrW.qoZ.d(null);
                  this.qrW.qoZ.d(null);
                  break;
               default:
                  return;
            }

            this.qrW.qtP.removeNodeFromParent(var3);
         }
      }
   }
}
