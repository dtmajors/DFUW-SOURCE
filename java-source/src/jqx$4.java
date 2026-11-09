class jqx$4 implements lbi<jri> {
   jqx$4(jqx var1) {
      this.nTG = var1;
   }

   public final void b(jri var1) {
      jqj var2 = (jqj)jqx.a(this.nTG).get(var1.dRs());
      if (var1.getErrorCode() != 0) {
         if (var1.getErrorCode() != -2147024726) {
            byte var3 = 5;
            if (var1.getErrorCode() == -2147024891) {
               var3 = 4;
            }
         }
      } else {
         jqx.b(this.nTG).rnh.m(jqz.r(jqx.b(this.nTG).rng, var1.dRs()));
         var2.dRe();
      }
   }
}
