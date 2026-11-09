import java.awt.event.ActionEvent;
import java.util.Map;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.tree.TreePath;

class lai$8 extends AbstractAction {
   lai$8(lai var1, String var2) {
      super(var2);
      this.qrW = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      TreePath var2 = this.qrW.qtO.getSelectionModel().getSelectionPath();
      if (var2 != null) {
         lae var3 = (lae)var2.getLastPathComponent();
         if (var3.getNodeType() == 10) {
            String[] var4 = lai.i(this.qrW);
            String var5 = (String)JOptionPane.showInputDialog(this.qrW, "Select PaperdollItemMap", "Select Map", 3, null, var4, lai.h(this.qrW));
            if (var5 != null) {
               Integer var6 = (Integer)lea.eot().get(var5);
               if (var6 == null) {
                  lfn.b(5, "SFPaperDollTreeView.CopyToOtherMap", "actionPerformed() No resourcetype was mapped to filename '" + var5 + "'");
               } else {
                  int var7 = var6;
                  if (!lai.a(this.qrW).isDescendant(var7, cug.fia)) {
                     Map var8 = lea.ack(var7);
                     if (var8 == null) {
                        lfn.b(
                           5,
                           "SFPaperDollTreeView.CopyToOtherMap",
                           "actionPerformed() No PaperdollItemMap was mapped to resourcetype '" + lai.a(this.qrW).getName(var7) + "'"
                        );
                     } else {
                        cam var9 = (cam)var3.getValue();
                        if (var8.containsKey(var9.aGl())) {
                           lfn.b(1, "SFPaperDollTreeView.CopyToOtherMap", "actionPerformed() PaperdollItemMap already contains resource '" + var9.pa() + "'");
                        } else {
                           var9 = var9.aGj();
                           var8.put(var9.aGl(), var9);
                        }
                     }
                  }
               }
            }
         }
      }
   }
}
