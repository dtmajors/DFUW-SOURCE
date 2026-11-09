import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.tree.TreePath;

class lat$2 extends AbstractAction {
   lat$2(lat var1, String var2) {
      super(var2);
      this.qtL = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      TreePath var2 = this.qtL.qtO.getSelectionModel().getSelectionPath();
      if (var2 != null && !this.qtL.c((lae)var2.getLastPathComponent())) {
         dgj var3 = this.qtL.qoZ.ekt();
         if (var3 != null) {
            lae var4 = (lae)var2.getLastPathComponent();
            dgj var5 = var3.createCopy();
            dgj var6 = (dgj)var4.getValue();
            dkw var7 = var6.getContainerManager();
            if (var7 == null) {
               var7 = new dkw();
               var6.setContainerManager(var7);
            }

            var5.setEffectInstanceID(var7.bob());
            var7.e(var5);
            lae var8 = lat.a(this.qtL, var5, true);
            var4.add(var8);
            this.qtL.qtP.reload(var4);
            this.qtL.qtO.getSelectionModel().setSelectionPath(var2.getParentPath().pathByAddingChild(var8));
            this.qtL.qoZ.a(var5, true);
         }
      }
   }
}
