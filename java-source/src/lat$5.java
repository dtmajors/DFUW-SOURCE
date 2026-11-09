import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class lat$5 extends AbstractAction {
   lat$5(lat var1, String var2) {
      super(var2);
      this.qtL = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.qtL.qoZ.aa(lat.c(this.qtL));
   }
}
