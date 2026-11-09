import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class mvc$9 extends AbstractAction {
   mvc$9(mvc var1, String var2) {
      super(var2);
      this.EJE = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mvc.e(this.EJE);
   }
}
