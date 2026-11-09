import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.tree.TreePath;

class lag$1 extends AbstractAction {
   lag$1(lag var1, String var2) {
      super(var2);
      this.qru = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      TreePath var2 = this.qru.qtO.getSelectionModel().getSelectionPath();
      if (var2 != null && !this.qru.c((lae)var2.getLastPathComponent())) {
         lae var3 = (lae)var2.getLastPathComponent();
         String var4 = (String)JOptionPane.showInputDialog(this.qru, "Select ObjectType", "Add ObjectType", 3, null, lag.a(this.qru), lag.a(this.qru)[0]);
         if (lag.b(this.qru).contains(var4)) {
            lfn.b(0, "SFXMLObjectTreeView.initPopupMenu()", "actionPerformed() ObjectType already exists.");
         } else {
            lae var5 = new lae(9, amh.dn(var4), var4);
            var3.add(var5);
            this.qru.qtP.reload(var3);
            int var6 = lag.b(this.qru).getType(var3.getName());
            ler var7 = lag.b(this.qru).acv(var6);
            lfl var8 = new lfl();
            var8.setName(var4);
            var8.setType(this.qru.qoZ.dn(var4));
            lag.b(this.qru).a(var7, var8, null);
         }
      }
   }
}
