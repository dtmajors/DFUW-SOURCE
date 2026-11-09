import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class lal$6 extends AbstractAction {
   lal$6(lal var1) {
      this.qsJ = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = lal.a(this.qsJ).u();
      if (var2 != null && !var2.trim().equals("")) {
         int var3 = lal.c(this.qsJ).getType(var2);
         if (lal.c(this.qsJ).isDescendant(var3, cug.fgE)) {
            lal.g(this.qsJ).setText(var2);
         }
      }
   }
}
