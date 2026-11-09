import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class law$10 extends AbstractAction {
   law$10(law var1) {
      this.quD = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = law.j(this.quD).getText();
      if (var2 != null && !var2.trim().equals("")) {
         if (law.h(this.quD).isSelected()) {
            String var3 = law.i(this.quD).getText();
            if (var3 == null || var3.trim().equals("")) {
               return;
            }

            law.f(this.quD).aw(var3, var2);
         } else {
            law.f(this.quD).yP(var2);
         }
      }
   }
}
