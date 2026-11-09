class itz$a extends iqz {
   private itz$a() {
   }

   @Override
   public void e(ipf var1) {
      itz var2 = (itz)var1;
      ira.a(var2);
      var2.setSize(var2.getWidth() + itz.a(var2) + itz.b(var2), var2.getHeight() + itz.c(var2) + itz.d(var2));
   }

   @Override
   public void i(ipf var1) {
      itz var2 = (itz)var1;
      int var3 = itz.a(var2);
      int var4 = itz.c(var2);
      int var5 = var2.getWidth() - itz.a(var2) - itz.b(var2);
      int var6 = var2.getHeight() - itz.c(var2) - itz.d(var2);

      for (int var7 = 0; var7 < var2.bfn(); var7++) {
         ipf var8 = var2.RO(var7);
         if (var8.djO()) {
            if (var8 != var2.doB()) {
               var8.r(var3, var4, var5, var6);
            } else if (var2.dlY() == ire.mul) {
               var8.r(var3 + var5 / 2 - var8.getWidth() / 2, var4 + itz.e(var2), var8.getWidth(), var6 - itz.e(var2) - itz.f(var2));
            } else if (var2.dlY() == ire.muk) {
               var8.r(var3 + itz.g(var2), var4 + var6 / 2 - var8.getHeight() / 2, var5 - itz.g(var2) - itz.h(var2), var8.getHeight());
            }
         }
      }
   }
}
