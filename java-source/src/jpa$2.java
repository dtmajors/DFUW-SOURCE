class jpa$2 implements lbt<jpc> {
   jpa$2(jpa var1) {
      this.nLd = var1;
   }

   @Override
   public final void a(boolean var1, lbi<jpc> var2) {
      assert var1;
      assert var2 != null;
      assert jpa.b(this.nLd) == null;
      jpa.a(this.nLd, var2);
   }
}
