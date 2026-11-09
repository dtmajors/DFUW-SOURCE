import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.tree.TreePath;

class mvc$8 extends AbstractAction {
   mvc$8(mvc var1, String var2) {
      super(var2);
      this.EJE = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      TreePath var2 = mvc.a(this.EJE).getSelectionModel().getSelectionPath();
      if (var2 != null) {
         boolean var3 = !mvc.c(this.EJE).ap();
         TreePath var4 = new TreePath(mvc.c(this.EJE));
         mvc.a(this.EJE, var4, mvc.c(this.EJE), var3);
         mvc.d(this.EJE).reload(mvc.c(this.EJE));
      }
   }
}
