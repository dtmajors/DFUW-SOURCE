import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class lal$10 extends AbstractAction {
   lal$10(lal var1) {
      this.qsJ = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int var2 = lal.n(this.qsJ).getType(lal.m(this.qsJ).getText());
      if (var2 > 0) {
         float var3 = lal.b(this.qsJ, lal.o(this.qsJ).getText());
         if (!(var3 <= 0.0F)) {
            float var4 = lal.b(this.qsJ, lal.p(this.qsJ).getText());
            if (!(var4 < 0.0F) && !(var4 > 1.0F)) {
               boolean var5 = lal.q(this.qsJ).isSelected();
               lal.r(this.qsJ).SkillType = var2;
               lal.r(this.qsJ).SkillLevel = var3;
               lal.r(this.qsJ).fgs = var4;
               lal.r(this.qsJ).fgt = var5;
               lal.a(this.qsJ).ekx();
            }
         }
      }
   }
}
