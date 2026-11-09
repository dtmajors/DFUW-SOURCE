final class s$c {
   public final int cU;
   public final int cV;

   public s$c(int var1, int var2) {
      this.cU = var1;
      this.cV = var2;
   }

   public boolean a(s$c var1) {
      return this.cU == var1.cU && this.cV == var1.cV;
   }

   @Override
   public int hashCode() {
      return this.cV * 10 + this.cU;
   }

   @Override
   public boolean equals(Object var1) {
      assert var1 instanceof s$c;
      return this.a((s$c)var1);
   }
}
