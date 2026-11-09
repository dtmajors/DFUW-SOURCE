import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class kyl$2 extends AbstractAction {
   kyl$2(kyl var1) {
      this.qkV = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      kyk var2 = (kyk)kyl.h(this.qkV).getSelectedValue();
      if (var2 != null) {
         String var3 = (String)kyl.a(this.qkV).getSelectedItem();
         if (var3 == null) {
            lfn.b(5, "ChangeButton", "actionPerformed() FilterTypeName is invalid");
         } else {
            String var4 = (String)kyl.b(this.qkV).getSelectedItem();
            if (var4 == null) {
               lfn.b(5, "ChangeButton", "actionPerformed() CheckTypeName is invalid");
            } else {
               int var5 = kyk.xI((String)kyl.c(this.qkV).getSelectedItem());
               if (var5 < 0) {
                  lfn.b(5, "ChangeButton", "actionPerformed() MinLogLevel is invalid");
               } else {
                  String var6 = kyl.d(this.qkV).getText();
                  var2.a(kyk$b.valueOf(var3));
                  var2.a(kyk$a.valueOf(var4));
                  var2.abj(var5);
                  var2.setExpression(var6);
                  var2.setEnabled(kyl.e(this.qkV).isSelected());
                  int var7 = kyl.h(this.qkV).getSelectedIndex();
                  kyl.g(this.qkV).removeElementAt(var7);
                  kyl.g(this.qkV).add(var7, var2);
                  kyl.h(this.qkV).setSelectedIndex(var7);
               }
            }
         }
      }
   }
}
