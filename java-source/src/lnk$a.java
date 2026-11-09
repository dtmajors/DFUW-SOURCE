import java.lang.reflect.Field;

public class lnk$a extends lnh$a implements lms {
   public static final lnk$a rFB = new lnk$a();
   public final Field rFm;

   private lnk$a() {
      super(lnh$a.rFy);
      this.rFm = null;
   }

   public lnk$a(Field var1) {
      super(rFB);
      assert var1 != null;
      this.rFm = var1;
   }

   @Override
   protected final lnh evM() {
      assert false;
      return null;
   }

   @Override
   public final lmv ap(Object var1) {
      assert this.rFm != null;
      assert var1 != null;
      assert this.rFm.getDeclaringClass().isInstance(var1);
      return this.ax(var1);
   }

   @Override
   public final Class<?> euW() {
      return this.rFm.getType();
   }

   public final lnk ax(Object var1) {
      assert this.rFm != null;
      return new lnk(this, var1);
   }

   @Override
   protected lmu eva() {
      return lnh$a.rFy;
   }
}
