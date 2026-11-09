import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.tree.TreePath;

class mvc$3 extends AbstractAction {
   mvc$3(mvc var1, String var2) {
      super(var2);
      this.EJE = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      TreePath var2 = mvc.a(this.EJE).getSelectionModel().getSelectionPath();
      if (var2 != null) {
         cc var3 = (cc)var2.getLastPathComponent();
         cc var4 = var3.at();
         if (var4 != null) {
            this.EJE.a(var4, var4.ao());
         } else {
            lfn.print("Classnode is null");
         }
      }
   }
}
