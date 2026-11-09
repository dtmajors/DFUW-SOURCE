import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class lan$2 extends AbstractAction {
   lan$2(lan var1) {
      this.qta = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = lan.f(this.qta).getText();
      if (var2 != null && var2.trim() != "") {
         lan.e(this.qta).yf(var2);
      }
   }
}
