import java.lang.reflect.Field;

public class lng$a extends lnd$a implements lms {
   public static final lng$a rFx = new lng$a();
   public final Field rFm;

   private lng$a() {
      super(lnd$a.rFt);
      this.rFm = null;
   }

   public lng$a(Field var1) {
      super(rFx);
      assert var1 != null;
      this.rFm = var1;
   }

   @Override
   protected final lnd evG() {
      assert false;
      return null;
   }

   @Override
   public final lmv ap(Object var1) {
      return this.aw(var1);
   }

   @Override
   public final Class<?> euW() {
      return this.rFm.getType();
   }

   public final lng aw(Object var1) {
      assert this.rFm != null;
      assert var1 != null;
      assert this.rFm.getDeclaringClass().isInstance(var1);
      return new lng(this, var1);
   }

   @Override
   protected lmu eva() {
      return lnd$a.rFt;
   }
}
