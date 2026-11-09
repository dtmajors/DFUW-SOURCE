import java.lang.reflect.Field;

public class loa$a extends lnx$a implements lms {
   public static final loa$a rFZ = new loa$a();
   public final Field rFm;

   private loa$a() {
      super(lnx$a.rFU);
      this.rFm = null;
   }

   public loa$a(Field var1) {
      super(rFZ);
      assert var1 != null;
      this.rFm = var1;
   }

   @Override
   protected final lnx ews() {
      assert false;
      return null;
   }

   @Override
   public final lmv ap(Object var1) {
      return this.aB(var1);
   }

   @Override
   public final Class<?> euW() {
      return this.rFm.getType();
   }

   public final loa aB(Object var1) {
      assert this.rFm != null;
      assert var1 != null;
      assert this.rFm.getDeclaringClass().isInstance(var1);
      return new loa(this, var1);
   }

   @Override
   protected lmu eva() {
      return lnx$a.rFU;
   }
}
