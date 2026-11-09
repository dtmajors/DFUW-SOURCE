public class lnu$a extends lnt$a {
   public static final lnu$a rFR = new lnu$a();

   private lnu$a() {
      super(lnt$a.rFO);
   }

   public lnu$a(int var1, int var2) {
      this(var1, var2, 1);
   }

   public lnu$a(int var1, int var2, int var3) {
      super(rFR, var1, var2, var3);
   }

   public final lnu ewm() {
      return new lnu(this);
   }

   @Override
   protected lnt ewk() {
      return this.ewm();
   }

   @Override
   protected lmu eva() {
      return lnt$a.rFO;
   }
}
