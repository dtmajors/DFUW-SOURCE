import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class lal$12 extends AbstractAction {
   lal$12(lal var1) {
      this.qsJ = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = lal.a(this.qsJ).ekr();
      if (var2 != null && !var2.trim().equals("")) {
         lal.t(this.qsJ).setText(var2);
      }
   }
}
