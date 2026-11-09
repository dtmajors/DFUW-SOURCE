import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class law$8 extends AbstractAction {
   law$8(law var1) {
      this.quD = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = law.e(this.quD).u();
      law.j(this.quD).setText(var2);
   }
}
