class hec$17 implements lbt<jpk> {
   hec$17(hec var1) {
      this.kdd = var1;
   }

   @Override
   public final void a(boolean var1, lbi<jpk> var2) {
      assert var1 ? hec.v(this.kdd) == null : hec.v(this.kdd) == var2;
      assert var2 != null;
      if (var1) {
         hec.b(this.kdd, var2);
      } else {
         hec.b(this.kdd, null);
      }
   }
}
