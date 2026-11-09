public class lnh$a extends lmu {
   public static final lnh$a rFy = new lnh$a();
   public final double kLl;
   public final double kLm;

   public lnh$a() {
      this(lmu.rET);
   }

   public lnh$a(double var1, double var3) {
      this(rFy, var1, var3);
   }

   protected lnh$a(lmu var1) {
      this(var1, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
   }

   protected lnh$a(lmu var1, double var2, double var4) {
      super(var1);
      assert var2 <= var4;
      this.kLl = var2;
      this.kLm = var4;
   }

   @Override
   protected final lmv dPk() {
      return this.evM();
   }

   protected lnh evM() {
      assert false;
      return null;
   }

   @Override
   protected String ccJ() {
      return "Double";
   }

   public final boolean ev(double var1) {
      return var1 == this.ew(var1);
   }

   public final double ew(double var1) {
      var1 = Math.min(var1, this.kLm);
      return Math.max(var1, this.kLl);
   }
}
