final class hlu$a$1 implements lbs<hlu$a> {
   public hlu$a a(lfu var1, hlu$a var2) {
      String var3 = var1.aA("Texture", var2 == null ? null : var2.fFC);
      lgg var4 = var1.a("Hotspot", var2 == null ? null : var2.kIl, lgg.Persistor);
      if (var2 != null && var3.equals(var2.fFC) && var4.T(var2.kIl)) {
         return var2;
      }

      assert var1.eqA();
      return new hlu$a(var4.cf, var4.cg, var3);
   }
}
