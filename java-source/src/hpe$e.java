public class hpe$e extends hpe$c {
   public final hpe$a kUX;
   public final hpe$b kUY;

   public hpe$e(hnb var1, lcq var2, hpe$a var3, hpe$b var4) {
      super(var1, var2);
      this.kUX = var3;
      this.kUY = var4;
   }

   public final boolean a(hpe$e var1) {
      return super.b(var1) && this.kUX == var1.kUX && this.kUY == var1.kUY;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 instanceof hpe$e) {
         return this.a((hpe$e)var1);
      }

      assert false;
      return false;
   }

   @Override
   public String toString() {
      return "Singleline: " + super.toString() + ", AlignmentX=" + this.kUX + ", AlignmentY=" + this.kUY;
   }
}
