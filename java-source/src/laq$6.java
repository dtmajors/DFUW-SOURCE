import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class laq$6 extends AbstractAction {
   laq$6(laq var1) {
      this.qtu = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = laq.g(this.qtu).getText();
      String var3 = laq.h(this.qtu).getText();
   }
}
