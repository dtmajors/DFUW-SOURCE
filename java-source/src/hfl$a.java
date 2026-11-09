public class hfl$a {
   public final hnb jFE;
   public final lcq dMT;

   public hfl$a(hnb var1, lcq var2) {
      this.jFE = var1;
      this.dMT = var2;
   }

   public final boolean a(hfl$a var1) {
      return this.jFE.c(var1.jFE) && this.dMT.X(var1.dMT);
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 instanceof hfl$a) {
         return this.a((hfl$a)var1);
      }

      assert false;
      return false;
   }

   @Override
   public String toString() {
      return "Font=" + this.jFE + ", Color=" + this.dMT;
   }
}
