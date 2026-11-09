import java.lang.reflect.Field;

public class lof$a extends loc$a implements lms {
   public static final lof$a rGk = new lof$a();
   public final Field rFm;

   private lof$a() {
      super(loc$a.rGg);
      this.rFm = null;
   }

   public lof$a(Field var1) {
      super(rGk);
      assert var1 != null;
      this.rFm = var1;
   }

   @Override
   protected loc ewB() {
      assert false;
      return null;
   }

   @Override
   public final lmv ap(Object var1) {
      return this.aC(var1);
   }

   @Override
   public final Class<?> euW() {
      return this.rFm.getType();
   }

   public final lof aC(Object var1) {
      assert this.rFm != null;
      assert var1 != null;
      assert this.rFm.getDeclaringClass().isInstance(var1);
      return new lof(this, var1);
   }

   @Override
   protected lmu eva() {
      return loc$a.rGg;
   }
}
