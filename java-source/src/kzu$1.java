import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.tree.TreePath;

class kzu$1 extends AbstractAction {
   kzu$1(kzu var1, String var2) {
      super(var2);
      this.qoN = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      TreePath var2 = this.qoN.qtO.getSelectionModel().getSelectionPath();
      if (var2 != null && !this.qoN.c((lae)var2.getLastPathComponent())) {
         lae var3 = (lae)var2.getLastPathComponent();
         String var4 = JOptionPane.showInputDialog(this.qoN, "Enter ActionName", "Add Action", 3);
         if (var4 != null && !var4.trim().equals("")) {
            var4 = var4.trim();
            if (!this.qoN.nOR.contains(var4)) {
               lae var5 = new lae(1, this.qoN.nOR.getType(var4), var4);
               var3.add(var5);
               this.qoN.qtP.reload(var3);
               int var6 = this.qoN.nOR.getType(var3.getName());
               ler var7 = this.qoN.nOR.acv(var6);
               lby var8 = new lby();
               var8.setName(var4);
               var8.setType(this.qoN.nOR.eqp());
               var8.yd(true);
               var8.ye(true);
               var8.yf(false);
               var8.dP(0.5);
               var8.yg(false);
               this.qoN.nOR.a(var7, var8, null);
            }
         }
      }
   }
}
