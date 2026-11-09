import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class lal$9 extends AbstractAction {
   lal$9(lal var1) {
      this.qsJ = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = lal.a(this.qsJ).eks();
      if (var2 != null && !var2.trim().equals("")) {
         lal.m(this.qsJ).setText(var2);
      }
   }
}
