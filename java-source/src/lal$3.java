import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class lal$3 extends AbstractAction {
   lal$3(lal var1) {
      this.qsJ = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = lal.a(this.qsJ).eks();
      if (var2 != null && !var2.trim().equals("")) {
         lal.v(this.qsJ).setText(var2);
      }
   }
}
