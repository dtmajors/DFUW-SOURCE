class jqx$1 implements lbi<jrt> {
   jqx$1(jqx var1) {
      this.nTG = var1;
   }

   public final void a(jrt var1) {
      if (var1.getErrorCode() != 0) {
         assert false;
      } else {
         int var2 = var1.dRx();
         if ((var2 & 64) != 0) {
            jqx.a(this.nTG, var1.dRO());
         }

         if ((var2 & 1) != 0) {
            jqx.b(this.nTG, var1.dRI());
         }

         if ((var2 & 2) != 0) {
            jqx.c(this.nTG, var1.dRJ());
         }

         if ((var2 & 8) != 0) {
            jqx.d(this.nTG, var1.dRK());
         }

         if ((var2 & 32) != 0) {
            jqx.e(this.nTG, var1.dRN());
         }

         if ((var2 & 16) != 0) {
            jqx.f(this.nTG, var1.dRL());
         }

         if ((var2 & 4) != 0) {
            jqx.g(this.nTG, var1.dRM());
         }
      }
   }
}
