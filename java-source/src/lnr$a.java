public class lnr$a extends lnp$a implements lmr {
   public static final lnr$a rFM = new lnr$a();
   public final Class<?> rFk;

   private lnr$a() {
      super(lnp$a.rFI);
      this.rFk = null;
   }

   public lnr$a(Class<?> var1) {
      super(rFM);
      assert var1 != null;
      this.rFk = var1;
   }

   @Override
   protected final lnp ewb() {
      assert false;
      return null;
   }

   @Override
   public final lmv a(lnc var1, int var2) {
      return this.e(var1, var2);
   }

   @Override
   public final Class<?> euW() {
      return this.rFk.getComponentType();
   }

   public final lnr e(lnc var1, int var2) {
      assert this.rFk != null;
      assert var1 != null;
      assert this.rFk.isAssignableFrom(var1.evC().evD());
      return new lnr(this, var1, var2);
   }

   @Override
   protected final lmu eva() {
      return lnp$a.rFI;
   }
}
