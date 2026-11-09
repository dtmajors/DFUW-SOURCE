import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class law$12 extends AbstractAction {
   law$12(law var1) {
      this.quD = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = law.e(this.quD).eks();
      law.m(this.quD).setText(var2);
   }
}
