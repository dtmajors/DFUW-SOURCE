import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class laq$3 extends AbstractAction {
   laq$3(laq var1) {
      this.qtu = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = laq.c(this.qtu).getText();
      if (var2 != null && var2.trim() != "") {
         laq.e(this.qtu).yi(var2);
      }
   }
}
