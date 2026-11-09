import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.tree.TreePath;

class lau$7 extends AbstractAction {
   lau$7(lau var1, String var2) {
      super(var2);
      this.quf = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      if (lau.a(this.quf) == null) {
         lau.a(this.quf, new laf(this.quf, this.quf.qoZ.getLocation()));
      }

      if (!lau.a(this.quf).isVisible()) {
         lau.a(this.quf).setVisible(true);
      }

      TreePath var2 = this.quf.qtO.getSelectionModel().getSelectionPath();
      if (var2 != null) {
         lae var3 = (lae)var2.getLastPathComponent();
         ler var4 = var3.dHM();
         les var5 = var3.elc();
         if (var4 != null && var5 != null) {
            if (this.quf instanceof kzu) {
               lau.a(this.quf).setTitle("Action ContentDialog");
            } else if (this.quf instanceof laa) {
               lau.a(this.quf).setTitle("Effect ContentDialog");
            } else if (this.quf instanceof lac) {
               lau.a(this.quf).setTitle("Function ContentDialog");
            } else if (this.quf instanceof lao) {
               lau.a(this.quf).setTitle("Resource ContentDialog");
            } else if (this.quf instanceof lar) {
               lau.a(this.quf).setTitle("Skill ContentDialog");
            } else {
               lau.a(this.quf).setTitle("TreeView ContentDialog");
            }

            lau.a(this.quf).a(var3, var4, var5);
         }
      }
   }
}
