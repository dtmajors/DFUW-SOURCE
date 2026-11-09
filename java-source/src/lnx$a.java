public class lnx$a extends lmu {
   public static final lnx$a rFU = new lnx$a();
   public final long rFV;
   public final long rFW;

   public lnx$a() {
      this(lmu.rET);
   }

   protected lnx$a(lmu var1) {
      this(var1, Long.MIN_VALUE, Long.MAX_VALUE);
   }

   protected lnx$a(long var1, long var3) {
      this(rFU, var1, var3);
   }

   protected lnx$a(lmu var1, long var2, long var4) {
      super(var1);
      assert var2 <= var4;
      this.rFV = var2;
      this.rFW = var4;
   }

   public final lnx ewr() {
      return this.ews();
   }

   @Override
   protected final lmv dPk() {
      return this.ewr();
   }

   protected lnx ews() {
      assert false;
      return null;
   }

   @Override
   protected String ccJ() {
      return "Long";
   }

   public final long aA(long var1) {
      var1 = Math.min(var1, this.rFW);
      return Math.max(var1, this.rFV);
   }

   public final boolean aB(long var1) {
      return var1 == this.aA(var1);
   }
}
