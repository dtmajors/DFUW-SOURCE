final class hnb$1 implements lbs<hnb> {
   public hnb a(lfu var1, hnb var2) {
      String var3 = var1.aA("Facename", var2 == null ? null : var2.kNa);
      int var4 = var1.ad("Pointsize", var2 == null ? 0 : var2.kNb);
      int var5 = var1.ad("Weight", var2 == null ? 0 : var2.kNc);
      boolean var6 = var1.V("Italic", var2 == null ? false : var2.kNd);
      if (var2 != null && var2.b(var3, var4, var5, var6)) {
         return var2;
      }

      assert var1.eqA();
      return new hnb(var3, var4, var5, var6);
   }
}
