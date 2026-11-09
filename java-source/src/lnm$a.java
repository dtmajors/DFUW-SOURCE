public class lnm$a<E extends Enum<E>> extends lnl$a<E> {
   public static final lnm$a rFF = new lnm$a();

   private lnm$a() {
      super(lnl$a.rFC, null);
   }

   public lnm$a(Class<E> var1) {
      super(rFF, var1);
      assert var1 != null;
   }

   @Override
   protected lmv dPk() {
      return this.evV();
   }

   public final lnm<E> evV() {
      return new lnm<>(this);
   }

   @Override
   protected lmu eva() {
      return lnl$a.rFC;
   }
}
