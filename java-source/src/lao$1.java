import bqm.a;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.tree.TreePath;

class lao$1 extends AbstractAction {
   lao$1(lao var1, String var2) {
      super(var2);
      this.qtc = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      TreePath var2 = this.qtc.qtO.getSelectionModel().getSelectionPath();
      if (var2 != null && !this.qtc.c((lae)var2.getLastPathComponent())) {
         lae var3 = (lae)var2.getLastPathComponent();
         String var4 = JOptionPane.showInputDialog(this.qtc, "Enter ResourceName", "Add Resource to '" + var3.getName() + "'", 3);
         if (var4 != null && !var4.trim().equals("")) {
            var4 = var4.trim();
            if (this.qtc.ResourceTree.contains(var4)) {
               lfn.b(2, "SFXMLResourceTreeView", "actionPerformed() Resource already exists.");
            } else {
               lae var5 = new lae(15, this.qtc.ResourceTree.getType(var4), var4);
               var3.add(var5);
               this.qtc.qtP.reload(var3);
               int var6 = this.qtc.ResourceTree.getType(var3.getName());
               ler var7 = this.qtc.ResourceTree.acv(var6);
               lgw var8 = new lgw();
               var8.setName(var4);
               var8.setType(this.qtc.ResourceTree.eqp());
               var8.a(new lhu(32, 32, "gui_icon_generic_32x32.bmp"));
               var8.jC("NULL");
               var8.a(a.dDV);
               var8.ys(false);
               var8.yt(false);
               var8.b(cak.c.efE);
               this.qtc.ResourceTree.a(var7, var8, null);
            }
         }
      }
   }
}
