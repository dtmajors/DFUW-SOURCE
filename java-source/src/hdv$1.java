final class hdv$1 implements lbs<hdv> {
   public hdv a(lfu var1, hdv var2) {
      int var3 = hdv.d(var2);
      int var4 = var1.ad("Type", var3);
      if (var3 == var4) {
         return var2;
      }

      var3 = var4;
      if (var3 == -1) {
         return null;
      }

      assert var1.eqA();
      return hdv.LU(var3);
   }
}
