final class lcq$1 implements lbs<lcq> {
   public lcq a(lfu var1, lcq var2) {
      float var3 = var1.e("R", var2 == null ? 0.0F : var2.r);
      float var4 = var1.e("G", var2 == null ? 0.0F : var2.g);
      float var5 = var1.e("B", var2 == null ? 0.0F : var2.b);
      float var6 = var1.e("A", var2 == null ? 0.0F : var2.a);
      if (var2 != null && var2.j(var3, var4, var5, var6)) {
         return var2;
      }

      assert var1.eqA();
      return new lcq(var3, var4, var5, var6);
   }
}
