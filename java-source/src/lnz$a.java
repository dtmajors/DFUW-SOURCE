public class lnz$a extends lnx$a implements lmr {
   public static final lnz$a rFY = new lnz$a();
   public final Class<?> rFk;

   private lnz$a() {
      super(lnx$a.rFU);
      this.rFk = null;
   }

   public lnz$a(Class<?> var1) {
      super(rFY);
      assert var1 != null;
      this.rFk = var1;
   }

   @Override
   protected final lnx ews() {
      assert false;
      return null;
   }

   @Override
   public final lmv a(lnc var1, int var2) {
      return this.g(var1, var2);
   }

   @Override
   public final Class<?> euW() {
      return this.rFk;
   }

   public final lnz g(lnc var1, int var2) {
      assert this.rFk != null;
      assert var1 != null;
      assert this.rFk.isAssignableFrom(var1.evC().evD());
      return new lnz(this, var1, var2);
   }

   @Override
   protected final lmu eva() {
      return lnx$a.rFU;
   }
}
