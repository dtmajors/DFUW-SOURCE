class mrt$a {
   ljq Enx;
   ljq Eny;

   public mrt$a(mrt var1, ljq var2, ljq var3) {
      this.Env = var1;
      this.Enx = null;
      this.Eny = null;
      this.Enx = var2;
      this.Eny = var3;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == null) {
         return false;
      }

      assert var1 instanceof mrt$a : "incorrect type ->" + var1.getClass();
      mrt$a var2 = (mrt$a)var1;
      return this.Enx.B(var2.Enx, mrt.a(this.Env)) && this.Eny.B(var2.Eny, mrt.a(this.Env))
         || this.Enx.B(var2.Eny, mrt.a(this.Env)) && this.Eny.B(var2.Enx, mrt.a(this.Env));
   }

   @Override
   public int hashCode() {
      return (int)(this.Enx.x + this.Eny.x);
   }
}
