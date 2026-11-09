import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class kyl$3 extends AbstractAction {
   kyl$3(kyl var1) {
      this.qkV = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      kyk var2 = (kyk)kyl.h(this.qkV).getSelectedValue();
      if (var2 != null) {
         int var3 = kyl.h(this.qkV).getSelectedIndex();
         kyl.f(this.qkV).remove(var3);
         kyl.g(this.qkV).remove(var3);
      }
   }
}
