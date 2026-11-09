import java.awt.Color;
import java.io.File;

class amr$1 extends mjg {
   amr$1(amr var1) {
      this.bAB = var1;
   }

   @Override
   public Object Hv() {
      String var1 = amr.f(this.bAB).getText();
      String var2 = var1 != null && !"".equalsIgnoreCase(var1) ? var1 : null;
      double var3 = amr.k(this.bAB).isEnabled() ? (Double)amr.k(this.bAB).getValue() : -1.0;
      if (var3 == 0.0) {
         amr.l(this.bAB).setForeground(Color.RED);
         return "Amount cannot be 0(zero)";
      }

      amq$a var5 = (amq$a)amr.c(this.bAB).getSelectedItem();
      if (amr.i(this.bAB).isSelected()) {
         if (amr.m(this.bAB) == null || "".equalsIgnoreCase(amr.m(this.bAB).getName())) {
            amr.l(this.bAB).setForeground(Color.RED);
            return "Missing file name";
         }

         amq.b(amr.m(this.bAB), var5, var2, var3);
      } else if (amr.h(this.bAB).isSelected()) {
         if (amr.m(this.bAB) == null || "".equalsIgnoreCase(amr.m(this.bAB).getName())) {
            amr.l(this.bAB).setForeground(Color.RED);
            return "Missing file name";
         }

         amq.a(amr.m(this.bAB), var5, var2, var3);
      } else {
         File[] var6 = new File[0];
         File var7 = new File(amq.bzU);
         var6 = var7.listFiles(new amr$1$1(this));

         for (File var11 : var6) {
            amq.a(var11, var5, var2, var3);
         }
      }

      amr.l(this.bAB).setForeground(Color.BLACK);
      return "Done";
   }

   @Override
   public void finished() {
      amr.a(this.bAB).setEnabled(true);
   }
}
