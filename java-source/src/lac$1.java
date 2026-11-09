import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.tree.TreePath;

class lac$1 extends AbstractAction {
   lac$1(lac var1, String var2) {
      super(var2);
      this.qqM = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      TreePath var2 = this.qqM.qtO.getSelectionModel().getSelectionPath();
      if (var2 != null && !this.qqM.c((lae)var2.getLastPathComponent())) {
         lae var3 = (lae)var2.getLastPathComponent();
         String var4 = JOptionPane.showInputDialog(this.qqM, "Enter FunctionName", "Add Function", 3);
         if (var4 != null && !var4.trim().equals("")) {
            var4 = var4.trim();
            if (this.qqM.dqt.contains(var4)) {
               lfn.b(0, "SFXMLFunctionTreeView.initPopupMenu()", "actionPerformed() Function already exists.");
            } else {
               lae var5 = new lae(6, this.qqM.dqt.getType(var4), var4);
               var3.add(var5);
               this.qqM.qtP.reload(var3);
               int var6 = this.qqM.dqt.getType(var3.getName());
               ler var7 = this.qqM.dqt.acv(var6);
               ldu var8 = new ldu();
               var8.setName(var4);
               var8.setType(this.qqM.dqt.eqp());
               this.qqM.dqt.a(var7, var8, null);
            }
         }
      }
   }
}
