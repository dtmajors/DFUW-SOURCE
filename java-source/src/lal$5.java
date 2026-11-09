import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class lal$5 extends AbstractAction {
   lal$5(lal var1) {
      this.qsJ = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int var2 = lal.c(this.qsJ).getType(lal.b(this.qsJ).getText());
      if (var2 > 0) {
         int var3 = lal.a(this.qsJ, lal.d(this.qsJ).getText());
         if (var3 > 0) {
            float var4 = lal.b(this.qsJ, lal.e(this.qsJ).getText());
            if (!(var4 < -1.0F) && !(var4 > 1.0F)) {
               float var5 = lal.b(this.qsJ, lal.f(this.qsJ).getText());
               if (!(var5 <= 0.0F)) {
                  int var6 = lal.c(this.qsJ).getType(lal.g(this.qsJ).getText());
                  if (lal.c(this.qsJ).isDescendant(var6, cug.fgE)) {
                     lal.h(this.qsJ).l(var2);
                     lal.h(this.qsJ).do(var3);
                     lal.h(this.qsJ).eR(var4);
                     lal.h(this.qsJ).eS(var5);
                     lal.h(this.qsJ).un(var6);
                     lal.a(this.qsJ).ekx();
                  }
               }
            }
         }
      }
   }
}
