class joy$2 implements jom {
   joy$2(joy var1) {
      this.nKX = var1;
   }

   @Override
   public final void a(boolean var1, jov var2, jor var3) {
      assert var2 != null;
      assert var3 != null;
      assert joy.a(this.nKX).get(var2) == (var1 ? null : var3);
      if (var1) {
         joy.a(this.nKX).put(var2, var3);
      } else {
         joy.a(this.nKX).remove(var2);
      }
   }

   @Override
   public final void a(boolean var1, jou var2, joq var3) {
      assert var2 != null;
      assert var3 != null;
      assert joy.b(this.nKX).get(var2) == (var1 ? null : var3);
      if (var1) {
         joy.b(this.nKX).put(var2, var3);
      } else {
         joy.b(this.nKX).remove(var2);
      }
   }
}
