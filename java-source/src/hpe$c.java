public abstract class hpe$c {
   public final hnb jFE;
   public final lcq dMT;

   public hpe$c(hnb var1, lcq var2) {
      assert var1 != null;
      assert var2 != null;
      this.jFE = var1;
      this.dMT = var2;
   }

   public final boolean b(hpe$c var1) {
      return this.jFE.c(var1.jFE) && this.dMT.X(var1.dMT);
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 instanceof hpe$c) {
         return this.b((hpe$c)var1);
      }

      assert false;
      return false;
   }

   @Override
   public String toString() {
      return "Font=" + this.jFE + ", Color=" + this.dMT;
   }
}
