import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class lal$8 extends AbstractAction {
   lal$8(lal var1) {
      this.qsJ = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int var2 = lal.c(this.qsJ).getType(lal.i(this.qsJ).getText());
      if (var2 > 0) {
         int var3 = lal.a(this.qsJ, lal.j(this.qsJ).getText());
         if (var3 > 0) {
            float var4 = lal.b(this.qsJ, lal.k(this.qsJ).getText());
            if (!(var4 < 0.0F) && !(var4 > 10.0F)) {
               lal.l(this.qsJ).ResourceType = var2;
               lal.l(this.qsJ).asi = var3;
               lal.l(this.qsJ).fgb = var4;
               lal.a(this.qsJ).ekx();
            }
         }
      }
   }
}
