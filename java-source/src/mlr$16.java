import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mlr$16 implements ActionListener {
   mlr$16(mlr var1) {
      this.DKI = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      lfn.b(0, this.getClass().getSimpleName(), "playStateButton_ActionPerformed() : Sending AnimationStartMessage!");
      dzv var2 = (dzv)mlr.h(this.DKI).d(7425);
      var2.on(mlr.c(this.DKI).getGUID());
      var2.f(lcr.qzr);
      var2.dTs = 65539;
      mlr.h(this.DKI).a(var2);
   }
}
