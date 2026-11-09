class jof$8 implements lbi<jrp> {
   jof$8(jof var1) {
      this.nHQ = var1;
   }

   public final void c(jrp var1) {
      if (var1.getErrorCode() != 0) {
         assert false;
      } else if (var1.dRG() == null) {
         assert false;
      } else {
         jod[] var2 = var1.dRG();
         jof.a(this.nHQ, new jqx$a[var2.length]);

         for (int var3 = 0; var3 < var2.length; var3++) {
            jod var4 = var2[var3];
            jof.k(this.nHQ)[var3] = new jqx$a();
            jof.k(this.nHQ)[var3].nTH = var4;
            if (var4.getType() == 255) {
               jof.k(this.nHQ)[var3].nTI = new joe[0];
            } else {
               jof.l(this.nHQ).rnh.m(jqz.r(jof.l(this.nHQ).rng, var4.getGUID()));
            }
         }

         jof.m(this.nHQ);
      }
   }
}
