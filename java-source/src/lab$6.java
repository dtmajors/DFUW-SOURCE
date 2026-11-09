import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class lab$6 extends AbstractAction {
   lab$6(lab var1) {
      this.qqJ = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = lab.g(this.qqJ).getText();
      if (var2 != null && var2.trim() != "") {
         lab.f(this.qqJ).yd(var2);
      }
   }
}
