import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Icon;

class mnf$12 extends AbstractAction {
   mnf$12(mnf var1, String var2, Icon var3) {
      super(var2, var3);
      this.DOK = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mnf.a(this.DOK).setScale(2.0 * mnf.a(this.DOK).getScale());
   }
}
