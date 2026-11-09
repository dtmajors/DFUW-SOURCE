public class lnp$a extends lmu {
   public static final lnp$a rFI = new lnp$a();
   public final float rFJ;
   public final float rFK;

   private lnp$a() {
      this(lmu.rET);
   }

   protected lnp$a(lmu var1) {
      this(var1, Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY);
   }

   public lnp$a(float var1, float var2) {
      this(rFI, var1, var2);
   }

   protected lnp$a(lmu var1, float var2, float var3) {
      super(var1);
      assert var2 <= var3;
      this.rFJ = var2;
      this.rFK = var3;
   }

   public final lnp ewa() {
      return this.ewb();
   }

   @Override
   protected final lmv dPk() {
      return this.ewa();
   }

   protected lnp ewb() {
      assert false;
      return null;
   }

   @Override
   protected String ccJ() {
      return "Float";
   }

   public final boolean nK(float var1) {
      return var1 == this.nL(var1);
   }

   public final float nL(float var1) {
      var1 = Math.min(var1, this.rFK);
      return Math.max(var1, this.rFJ);
   }
}
