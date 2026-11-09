public class lnv$a extends lnt$a implements lmr {
   public static final lnv$a rFS = new lnv$a();
   public final Class<?> rFk;

   private lnv$a() {
      super(lnt$a.rFO);
      this.rFk = null;
   }

   public lnv$a(Class<?> var1) {
      super(rFS);
      assert var1 != null;
      this.rFk = var1;
   }

   @Override
   protected final lnt ewk() {
      assert false;
      return null;
   }

   @Override
   public final lmv a(lnc var1, int var2) {
      return this.f(var1, var2);
   }

   @Override
   public final Class<?> euW() {
      return this.rFk;
   }

   public final lnv f(lnc var1, int var2) {
      assert this.rFk != null;
      assert var1 != null;
      assert this.rFk.isAssignableFrom(var1.evC().evD());
      return new lnv(this, var1, var2);
   }

   @Override
   protected final lmu eva() {
      return lnt$a.rFO;
   }
}
