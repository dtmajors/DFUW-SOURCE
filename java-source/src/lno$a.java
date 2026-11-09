import java.lang.reflect.Field;

public class lno$a<E extends Enum<E>> extends lnl$a<E> implements lms {
   public static final lno$a rFH = new lno$a();
   public final Field rFm;

   private lno$a() {
      super(lnl$a.rFC, null);
      this.rFm = null;
   }

   public lno$a(Field var1) {
      super(rFH, (Class<E>)var1.getType());
      this.rFm = var1;
   }

   @Override
   protected final lnl<E> evT() {
      assert false;
      return null;
   }

   @Override
   public final lmv ap(Object var1) {
      return this.ay(var1);
   }

   @Override
   public final Class<?> euW() {
      return this.rFm.getType();
   }

   public final lno<E> ay(Object var1) {
      assert this.rFm != null;
      assert var1 != null;
      assert this.rFm.getDeclaringClass().isInstance(var1);
      return new lno<>(this, var1);
   }

   @Override
   protected lmu eva() {
      return lnl$a.rFC;
   }
}
