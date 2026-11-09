class hsi$1 implements lbi<ktl> {
   hsi$1(hsi var1) {
      this.lca = var1;
   }

   public void c(ktl var1) {
      knt var2 = (knt)hsi.a(this.lca).get(var1.dXg());
      ldv var3 = var1.dXh();
      hrz var4 = (hrz)hsi.b(this.lca).get(var3);
      if (var2 == null) {
         assert lda.by(var2);
      }

      if (var4 != null) {
         var4.a(var1, var2);
      }
   }
}
