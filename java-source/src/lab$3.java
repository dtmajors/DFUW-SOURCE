import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class lab$3 extends AbstractAction {
   lab$3(lab var1) {
      this.qqJ = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = lab.g(this.qqJ).getText();
      String var3 = (String)lab.l(this.qqJ).getSelectedItem();
   }
}
