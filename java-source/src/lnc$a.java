public class lnc$a extends lnb$a {
   public static final lnc$a rFq = new lnc$a();
   public final Class<?> rFr;
   public final lmu rFs;

   private lnc$a() {
      super(lnb$a.rFn, null);
      this.rFr = null;
      this.rFs = null;
   }

   public lnc$a(Class<?> var1, lmt var2) {
      this(var1, c(var1.getComponentType(), var2));
   }

   private lnc$a(Class<?> var1, lmu var2) {
      super(rFq, var2);
      assert var1.isArray();
      this.rFr = var1;
      this.rFs = var2;
   }

   private static final lmu c(Class<?> var0, lmt var1) {
      if (var0 == boolean.class) {
         return new lnf$a(var0);
      } else if (var0 == double.class) {
         return new lnj$a(var0);
      } else if (var0 == float.class) {
         return new lnr$a(var0);
      } else if (var0 == int.class) {
         return new lnv$a(var0);
      } else if (var0 == long.class) {
         return new lnz$a(var0);
      } else if (var0 == String.class) {
         return new loe$a(var0);
      } else {
         return Enum.class.isAssignableFrom(var0) ? new lnn$a(var0) : lmz$a.a(var0, var1);
      }
   }

   public final lnc au(Object var1) {
      assert this.rFr != null;
      assert var1 != null;
      return this.av(var1);
   }

   @Override
   protected lnb evB() {
      assert this.rFr != null;
      Object var1 = this.evw();
      return this.au(var1);
   }

   protected Object evw() {
      assert this.rFr != null;
      assert false;
      return null;
   }

   protected lnc av(Object var1) {
      assert this.rFr != null;
      return new lnc(this, var1);
   }

   public final Class<?> evD() {
      return this.rFr.getComponentType();
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
      return this.rFr.getSimpleName();
   }
}
