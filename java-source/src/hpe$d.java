public class hpe$d extends hpe$e {
   public final boolean kUW;

   public hpe$d(hnb var1, lcq var2, hpe$a var3, hpe$b var4, boolean var5) {
      super(var1, var2, var3, var4);
      this.kUW = var5;
   }

   public final boolean a(hpe$d var1) {
      return super.a(var1) && this.kUW == var1.kUW;
   }

   @Override
   public boolean equals(Object var1) {
      return var1 instanceof hpe$d ? this.a((hpe$d)var1) : false;
   }

   @Override
   public String toString() {
      return "Multiline: " + super.toString() + ", Wordbreak=" + this.kUW;
   }
}
