public class loe$a extends loc$a implements lmr {
   public static final loe$a rGj = new loe$a();
   public final Class<?> rFk;

   private loe$a() {
      super(loc$a.rGg);
      this.rFk = null;
   }

   public loe$a(Class<?> var1) {
      super(rGj);
      assert var1 != null;
      this.rFk = var1;
   }

   @Override
   protected final loc ewB() {
      assert false;
      return null;
   }

   @Override
   public final lmv a(lnc var1, int var2) {
      return this.h(var1, var2);
   }

   @Override
   public final Class<?> euW() {
      return this.rFk.getComponentType();
   }

   public final loe h(lnc var1, int var2) {
      assert this.rFk != null;
      assert var1 != null;
      assert this.rFk.isAssignableFrom(var1.evC().evD());
      return new loe(this, var1, var2);
   }

   @Override
   protected final lmu eva() {
      return loc$a.rGg;
   }
}
