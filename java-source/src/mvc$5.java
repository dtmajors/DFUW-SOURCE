import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.AbstractAction;
import javax.swing.tree.TreePath;

class mvc$5 extends AbstractAction {
   mvc$5(mvc var1, String var2) {
      super(var2);
      this.EJE = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      TreePath var2 = mvc.a(this.EJE).getSelectionModel().getSelectionPath();
      if (var2 != null) {
         cc var3 = (cc)var2.getLastPathComponent();
         ArrayList var4 = lcn.emv();
         mvc.a(this.EJE, var2, var3, 3, true, var4);
         StringBuilder var5 = new StringBuilder();

         for (int var6 = 0; var6 < var4.size(); var6++) {
            var5.append((String)var4.get(var6));
            var5.append("\n");
         }

         mvc.a(this.EJE, "Unique types under selected node", var5.toString());
      }
   }
}
