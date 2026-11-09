import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.tree.TreePath;

class lag$2 extends AbstractAction {
   lag$2(lag var1, String var2) {
      super(var2);
      this.qru = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      TreePath var2 = this.qru.qtO.getSelectionModel().getSelectionPath();
      if (var2 != null) {
         lae var3 = (lae)var2.getLastPathComponent();
         this.qru.qtP.removeNodeFromParent(var3);
         int var4 = this.qru.qoZ.dn(var3.getName());
         if (var4 > 0) {
            ler var5 = lag.b(this.qru).acv(var4);
            if (var5 != null) {
               lag.b(this.qru).j(var5);
            }
         }
      }
   }
}
