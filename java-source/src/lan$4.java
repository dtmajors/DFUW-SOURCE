import bqm.a;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class lan$4 extends AbstractAction {
   lan$4(lan var1) {
      this.qta = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = lan.g(this.qta).getText();
      if (var2 != null && !var2.trim().equals("")) {
         boolean var3 = lan.h(this.qta).isSelected();
         a var4 = a.getActivatableAction((String)lan.i(this.qta).getSelectedItem());
         String var5 = (String)lan.j(this.qta).getSelectedItem();
         cak.c var6 = cak.c.valueOf(var5);
         assert false;
         lan.k(this.qta).a(var4);
         lan.k(this.qta).b(var6);
      } else {
         lfn.b(5, "SFXMLResourcePropertyView", "createResourcePane() TextureFileName is null.");
      }
   }
}
