import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class lab$7 extends AbstractAction {
   lab$7(lab var1) {
      this.qqJ = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = lab.c(this.qqJ).getText();
      if (var2 != null && var2.trim() != "") {
         lab.f(this.qqJ).ye(var2);
      }
   }
}
