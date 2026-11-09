class hsg$3 implements lbt<jpp> {
   hsg$3(hsg var1) {
      this.lbC = var1;
   }

   @Override
   public final void a(boolean var1, lbi<jpp> var2) {
      assert hsg.a(this.lbC);
      assert var2 != null;
      assert hsg.c(this.lbC) == (var1 ? null : var2);
      if (var1) {
         hsg.a(this.lbC, var2);
      } else {
         hsg.a(this.lbC, null);
      }
   }
}
