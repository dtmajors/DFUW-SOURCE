import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class kyl$4 extends AbstractAction {
   kyl$4(kyl var1) {
      this.qkV = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      kyk[] var2 = kyl.f(this.qkV).toArray(new kyk[kyl.f(this.qkV).size()]);
      kyl.i(this.qkV).a(var2);
      this.qkV.setVisible(false);
   }
}
