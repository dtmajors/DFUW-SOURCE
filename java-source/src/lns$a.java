import java.lang.reflect.Field;

public class lns$a extends lnp$a implements lms {
   public static final lns$a rFN = new lns$a();
   public final Field rFm;

   private lns$a() {
      super(lnp$a.rFI);
      this.rFm = null;
   }

   public lns$a(Field var1) {
      super(rFN);
      assert var1 != null;
      this.rFm = var1;
   }

   @Override
   protected final lnp ewb() {
      assert false;
      return null;
   }

   @Override
   public final lmv ap(Object var1) {
      assert this.rFm != null;
      assert var1 != null;
      assert this.rFm.getDeclaringClass().isInstance(var1);
      return this.az(var1);
   }

   @Override
   public final Class<?> euW() {
      return this.rFm.getType();
   }

   public final lns az(Object var1) {
      assert this.rFm != null;
      return new lns(this, var1);
   }

   @Override
   protected lmu eva() {
      return lnp$a.rFI;
   }
}
