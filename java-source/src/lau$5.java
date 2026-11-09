import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.tree.TreePath;

class lau$5 extends AbstractAction {
   lau$5(lau var1, String var2) {
      super(var2);
      this.quf = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      TreePath var2 = this.quf.qtO.getSelectionModel().getSelectionPath();
      if (var2 != null) {
         lae var3 = (lae)var2.getLastPathComponent();
         this.quf.b(var2, var3);
      }
   }
}
