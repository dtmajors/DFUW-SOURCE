import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class mvc$2 extends AbstractAction {
   mvc$2(mvc var1, String var2) {
      super(var2);
      this.EJE = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.EJE.b(mvc.b(this.EJE), true);
   }
}
