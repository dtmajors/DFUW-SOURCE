import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class mtt$17 extends AbstractAction {
   mtt$17(mtt var1, String var2) {
      super(var2);
      this.EDj = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mtt.a(this.EDj, 1);
      mtt.e(this.EDj).setEnabled(true);
   }
}
