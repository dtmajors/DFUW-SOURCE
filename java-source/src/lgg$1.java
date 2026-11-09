final class lgg$1 implements lbs<lgg> {
   public lgg a(lfu var1, lgg var2) {
      int var3 = var1.ad("X", var2 == null ? 0 : var2.cf);
      int var4 = var1.ad("Y", var2 == null ? 0 : var2.cg);
      if (var2 != null && var2.fU(var3, var4)) {
         return var2;
      }

      assert var1.eqA();
      return new lgg(var3, var4);
   }
}
