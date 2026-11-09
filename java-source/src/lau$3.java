import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class lau$3 extends AbstractAction {
   lau$3(lau var1, String var2) {
      super(var2);
      this.quf = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.quf.qtP = this.quf.t();
      this.quf.qtO.setModel(this.quf.qtP);
   }
}
