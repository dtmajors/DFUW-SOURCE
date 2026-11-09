import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Icon;

class mnf$10 extends AbstractAction {
   mnf$10(mnf var1, String var2, Icon var3) {
      super(var2, var3);
      this.DOK = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      if (!mnf.a(this.DOK).isSelectionEmpty()) {
         mnf.e(this.DOK);
      }
   }
}
