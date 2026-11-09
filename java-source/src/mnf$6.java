import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Icon;

class mnf$6 extends AbstractAction {
   mnf$6(mnf var1, String var2, Icon var3) {
      super(var2, var3);
      this.DOK = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mnf.b(this.DOK);
      this.DOK.cu(mnf.c(this.DOK));
   }
}
