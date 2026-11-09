public class lnl$a<E extends Enum<E>> extends lmu {
   public static final lnl$a<?> rFC = new lnl$a();
   public final Class<E> rFD;

   private lnl$a() {
      super(lmu.rET);
      this.rFD = null;
   }

   protected lnl$a(lmu var1, Class<E> var2) {
      super(var1);
      this.rFD = var2;
   }

   @Override
   protected lmv dPk() {
      assert this.rFD != null;
      return this.evT();
   }

   protected lnl<E> evT() {
      assert false;
      return null;
   }

   @Override
   protected String ccJ() {
      return this.rFD.getSimpleName();
   }
}
