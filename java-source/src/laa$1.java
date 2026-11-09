import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.tree.TreePath;

class laa$1 extends AbstractAction {
   laa$1(laa var1, String var2) {
      super(var2);
      this.qqo = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      TreePath var2 = this.qqo.qtO.getSelectionModel().getSelectionPath();
      if (var2 != null && !this.qqo.c((lae)var2.getLastPathComponent())) {
         lae var3 = (lae)var2.getLastPathComponent();
         String var4 = JOptionPane.showInputDialog(this.qqo, "Enter EffectName", "Add Effect", 3);
         if (var4 != null && !var4.trim().equals("")) {
            var4 = var4.trim();
            if (this.qqo.DX.contains(var4)) {
               lfn.b(0, "SFXMLEffectTreeView.initPopupMenu()", "actionPerformed() Effect already exists.");
            } else {
               lae var5 = new lae(4, this.qqo.DX.getType(var4), var4);
               var3.add(var5);
               this.qqo.qtP.reload(var3);
               int var6 = this.qqo.DX.getType(var3.getName());
               ler var7 = this.qqo.DX.acv(var6);
               ldi var8 = new ldi();
               var8.setName(var4);
               var8.setType(this.qqo.DX.eqp());
               var8.acd(4192);
               this.qqo.DX.a(var7, var8, null);
            }
         }
      }
   }
}
