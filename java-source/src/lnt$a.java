public class lnt$a extends lmu {
   public static final lnt$a rFO = new lnt$a();
   public final int rFP;
   public final int rFQ;
   public final int ktf;

   public lnt$a() {
      this(lmu.rET);
   }

   protected lnt$a(lmu var1) {
      this(var1, Integer.MIN_VALUE, Integer.MAX_VALUE, 1);
   }

   protected lnt$a(int var1, int var2) {
      this(rFO, var1, var2, 1);
   }

   protected lnt$a(lmu var1, int var2, int var3, int var4) {
      super(var1);
      assert var2 <= var3;
      this.rFP = var2;
      this.rFQ = var3;
      this.ktf = var4;
   }

   public final lnt ewj() {
      return this.ewk();
   }

   @Override
   protected final lmv dPk() {
      return this.ewj();
   }

   protected lnt ewk() {
      assert false;
      return null;
   }

   @Override
   protected String ccJ() {
      return "Integer";
   }

   public final boolean isValidValue(int var1) {
      return var1 == this.adM(var1);
   }

   public final int adM(int var1) {
      var1 = Math.min(var1, this.rFQ);
      return Math.max(var1, this.rFP);
   }
}
