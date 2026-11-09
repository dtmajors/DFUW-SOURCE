import java.util.List;

public class lmz$a extends lmw$a {
   public static final lmz$a rFj = new lmz$a();
   public final Class<?> rFk;

   private lmz$a() {
      this(lmu.rET, null);
   }

   public lmz$a(Class<?> var1) {
      this(rFj, var1);
   }

   public lmz$a(lmu var1, Class<?> var2) {
      super(var1);
      this.rFk = var2;
   }

   public final lmz aq(Object var1) {
      assert this.rFk != null;
      assert var1 != null;
      return this.ar(var1);
   }

   @Override
   protected lmw evh() {
      assert this.rFk != null;
      Object var1 = this.evw();
      return this.aq(var1);
   }

   protected Object evw() {
      assert this.rFk != null;
      assert false;
      return null;
   }

   protected lmz ar(Object var1) {
      assert lda.by(var1);
      assert false;
      return null;
   }

   protected List<lmv> as(Object var1) {
      assert lda.by(var1);
      assert false;
      return null;
   }

   public static lmu a(Class<?> var0, lmt var1) {
      if (var1 != null && lmv.class.isAssignableFrom(var0)) {
         return var1.get(var0);
      } else {
         return var0.isArray() ? new lnc$a(var0, var1) : new lna$a(var0, var1);
      }
   }

   @Override
   protected String ccJ() {
      return this.rFk.getSimpleName();
   }
}
