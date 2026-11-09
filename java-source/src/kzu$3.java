import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class kzu$3 extends AbstractAction {
   kzu$3(kzu var1, String var2) {
      super(var2);
      this.qoN = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.qoN.qoZ.ekH();
   }
}
