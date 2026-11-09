import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class law$3 extends AbstractAction {
   law$3(law var1) {
      this.quD = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = law.m(this.quD).getText();
      if (var2 != null && !var2.trim().equals("")) {
         law.f(this.quD).yQ(var2);
      }
   }
}
