public class lnn$a<E extends Enum<E>> extends lnl$a<E> implements lmr {
   public static final lnn$a rFG = new lnn$a();
   public final Class<?> rFk;

   private lnn$a() {
      super(lnl$a.rFC, null);
      this.rFk = null;
   }

   public lnn$a(Class<E> var1) {
      super(rFG, var1);
      this.rFk = var1;
   }

   @Override
   protected final lnl<E> evT() {
      assert false;
      return null;
   }

   @Override
   public final lmv a(lnc var1, int var2) {
      return this.d(var1, var2);
   }

   @Override
   public final Class<?> euW() {
      return this.rFk;
   }

   public final lnn<E> d(lnc var1, int var2) {
      assert this.rFk != null;
      assert var1 != null;
      assert this.rFk.isAssignableFrom(var1.evC().evD());
      return new lnn<>(this, var1, var2);
   }

   @Override
   protected final lmu eva() {
      return lnl$a.rFC;
   }
}
