import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class lao$3 extends AbstractAction {
   lao$3(lao var1, String var2) {
      super(var2);
      this.qtc = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.qtc.qoZ.ekO();
   }
}
