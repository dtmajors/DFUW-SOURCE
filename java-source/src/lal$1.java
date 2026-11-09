import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class lal$1 extends AbstractAction {
   lal$1(lal var1) {
      this.qsJ = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = lal.a(this.qsJ).u();
      if (var2 != null && !var2.trim().equals("")) {
         lal.b(this.qsJ).setText(var2);
      }
   }
}
