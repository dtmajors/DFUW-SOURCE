public class lnj$a extends lnh$a implements lmr {
   public static final lnj$a rFA = new lnj$a();
   public final Class<?> rFk;

   private lnj$a() {
      super(lnh$a.rFy);
      this.rFk = null;
   }

   public lnj$a(Class<?> var1) {
      super(rFA);
      assert var1 != null;
      this.rFk = var1;
   }

   @Override
   protected final lnh evM() {
      assert false;
      return null;
   }

   @Override
   public final lmv a(lnc var1, int var2) {
      return this.c(var1, var2);
   }

   public final lnj c(lnc var1, int var2) {
      assert this.rFk != null;
      assert var1 != null;
      assert this.rFk.isAssignableFrom(var1.evC().evD());
      return new lnj(this, var1, var2);
   }

   @Override
   public final Class<?> euW() {
      return this.rFk;
   }

   @Override
   protected final lmu eva() {
      return lnh$a.rFy;
   }
}
