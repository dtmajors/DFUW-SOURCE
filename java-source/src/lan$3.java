import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class lan$3 extends AbstractAction {
   lan$3(lan var1) {
      this.qta = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = lan.c(this.qta).getText();
      if (var2 != null && var2.trim() != "") {
         lan.e(this.qta).yg(var2);
      }
   }
}
