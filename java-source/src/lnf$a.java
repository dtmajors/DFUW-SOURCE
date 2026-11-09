public class lnf$a extends lnd$a implements lmr {
   public static final lnf$a rFw = new lnf$a();
   public final Class<?> rFk;

   private lnf$a() {
      super(lnd$a.rFt);
      this.rFk = null;
   }

   public lnf$a(Class<?> var1) {
      super(rFw);
      assert var1 != null;
      this.rFk = var1;
   }

   @Override
   protected lnd evG() {
      assert false;
      return null;
   }

   @Override
   public final lmv a(lnc var1, int var2) {
      return this.b(var1, var2);
   }

   @Override
   public final Class<?> euW() {
      return this.rFk;
   }

   public final lnf b(lnc var1, int var2) {
      assert this.rFk != null;
      assert var1 != null;
      assert this.rFk.isAssignableFrom(var1.evC().evD());
      return new lnf(this, var1, var2);
   }

   @Override
   protected final lmu eva() {
      return lnd$a.rFt;
   }
}
