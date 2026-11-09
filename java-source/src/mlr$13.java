import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mlr$13 implements ActionListener {
   mlr$13(mlr var1) {
      this.DKI = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      if (mlr.j(this.DKI) == null) {
         float var2 = Float.parseFloat(mlr.k(this.DKI).getText());
         if (var2 != 0.0) {
            int var3 = mlr.c(this.DKI).az();
            mlr.a(this.DKI, mlr.c(this.DKI).av().esF());
            mlr.a(this.DKI, new lgl());
            mlr.d(this.DKI).X(mlr.c(this.DKI).aw());
            krj var4 = (krj)mlr.h(this.DKI).ii(2308);
            var4.ts(mlr.c(this.DKI).getGUID());
            var4.lQ(true);
            var4.wD(true);
            var4.xB(true);
            var4.c(mlr.b(this.DKI));
            var4.a(mlr.d(this.DKI));
            ljq var5 = new ljq(0.0F, 0.0F, 1.0F);
            var4.setStartDirection(var5);
            var4.ab(1000.0F);
            var4.dy(60.0F);
            var4.mM(-var2);
            var4.gS((float)mlr.h(this.DKI).arc().rgz);
            var4.xx(false);
            var4.xz(false);
            var4.c(new ldv[0]);
            var4.xy(true);
            var4.hC(mlr.c(this.DKI).getGUID());
            var4.mx(mlr.c(this.DKI).getGUID());
            mlr.a(this.DKI, null);
            mlr$13$1 var6 = new mlr$13$1(this);
            mlr.h(this.DKI).a(var4, var6, null);
         }
      }
   }
}
