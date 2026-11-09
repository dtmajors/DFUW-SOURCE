class hsg$4 implements lbi<fjk> {
   hsg$4(hsg var1) {
      this.lbC = var1;
   }

   public final void a(fjk var1) {
      if (var1.iNI >= 0 && var1.iNI <= 3) {
         hsg.a(this.lbC, (1 + var1.iNI) * 0.25F);
         assert hsg.d(this.lbC) >= 0.25 && hsg.d(this.lbC) <= 1.0 : var1.iNI + " -> " + hsg.d(this.lbC);
      } else {
         assert false;
         hsg.a(this.lbC, 0.0);
      }

      if (var1.iNJ >= 0 && var1.iNJ <= 31) {
         hsg.b(this.lbC, (31.0F - var1.iNJ) / 31.0F * 0.37F + 0.03F);
         assert hsg.e(this.lbC) >= 0.03F && hsg.e(this.lbC) <= 0.4F : var1.iNJ + " -> " + hsg.e(this.lbC);
      } else {
         assert false;
         hsg.b(this.lbC, 0.0);
      }

      hsg.c(this.lbC, var1.iNO / 1000.0);
      hsg.a(this.lbC, var1.iNK);
      return;

      throw new AssertionError(var1.iNJ + " -> " + hsg.e(this.lbC));
      throw new AssertionError(var1.iNI + " -> " + hsg.d(this.lbC));
   }
}
