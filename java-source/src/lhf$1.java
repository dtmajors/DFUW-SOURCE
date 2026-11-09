final class lhf$1 implements lbs<lhf> {
   public lhf a(lfu var1, lhf var2) {
      int var3 = var1.ad("W", var2 == null ? 0 : var2.rmN);
      int var4 = var1.ad("H", var2 == null ? 0 : var2.H);
      if (var2 != null && var2.fU(var3, var4)) {
         return var2;
      }

      assert var1.eqA();
      return new lhf(var3, var4);
   }
}
