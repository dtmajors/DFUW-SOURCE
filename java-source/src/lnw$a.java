import java.lang.reflect.Field;

public class lnw$a extends lnt$a implements lms {
   public static final lnw$a rFT = new lnw$a();
   public final Field rFm;

   private lnw$a() {
      super(lnt$a.rFO);
      this.rFm = null;
   }

   public lnw$a(Field var1) {
      super(rFT);
      assert var1 != null;
      this.rFm = var1;
   }

   @Override
   protected final lnt ewk() {
      assert false;
      return null;
   }

   @Override
   public final lmv ap(Object var1) {
      return this.aA(var1);
   }

   @Override
   public final Class<?> euW() {
      return this.rFm.getType();
   }

   public final lnw aA(Object var1) {
      assert this.rFm != null;
      assert var1 != null;
      assert this.rFm.getDeclaringClass().isInstance(var1);
      return new lnw(this, var1);
   }

   @Override
   protected lmu eva() {
      return lnt$a.rFO;
   }
}
