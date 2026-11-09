import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class kyl$1 extends AbstractAction {
   kyl$1(kyl var1) {
      this.qkV = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = (String)kyl.a(this.qkV).getSelectedItem();
      if (var2 == null) {
         lfn.b(5, "AddButton", "actionPerformed() FilterTypeName is invalid");
      } else {
         String var3 = (String)kyl.b(this.qkV).getSelectedItem();
         if (var3 == null) {
            lfn.b(5, "AddButton", "actionPerformed() CheckTypeName is invalid");
         } else {
            int var4 = kyk.xI((String)kyl.c(this.qkV).getSelectedItem());
            if (var4 < 0) {
               lfn.b(5, "AddButton", "actionPerformed() MinLogLevel is invalid");
            } else {
               String var5 = kyl.d(this.qkV).getText();
               kyk var6 = new kyk();
               var6.a(kyk$b.valueOf(var2));
               var6.a(kyk$a.valueOf(var3));
               var6.abj(var4);
               var6.setExpression(var5);
               var6.setEnabled(kyl.e(this.qkV).isSelected());
               kyl.f(this.qkV).add(var6);
               kyl.g(this.qkV).addElement(var6);
               kyl.h(this.qkV).setSelectedIndex(kyl.f(this.qkV).size() - 1);
            }
         }
      }
   }
}
