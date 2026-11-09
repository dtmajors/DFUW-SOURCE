import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lna$a extends lmz$a implements lms {
   public static final lna$a rFl = new lna$a();
   private final List<lna$a$a> rFa;
   private final List<lmw$a$a> rFb;

   private lna$a() {
      super(rFl, null);
      this.rFa = null;
      this.rFb = null;
   }

   public lna$a(Class<?> var1, lmt var2) {
      super(rFl, var1);
      assert !var1.isArray();
      this.rFa = b(var1, var2);
      List var3 = llv.cc(this.rFa);
      this.rFb = Collections.unmodifiableList(var3);
   }

   public lna at(Object var1) {
      assert this.rFk != null;
      assert var1 != null;
      assert this.rFk.isInstance(var1);
      return new lna(this, var1);
   }

   @Override
   public lmv ap(Object var1) {
      return this.at(var1);
   }

   @Override
   public Class<?> euW() {
      return this.rFk;
   }

   @Override
   protected List<lmv> as(Object var1) {
      assert var1 != null;
      assert this.rFk.isInstance(var1);
      ArrayList var2 = new ArrayList(this.rFa.size());

      for (lna$a$a var4 : this.rFa) {
         lmv var5;
         if (var4.kza instanceof lna$a) {
            boolean var13 = var4.rFm.isAccessible();
            if (!var13) {
               var4.rFm.setAccessible(true);
            }

            Object var12;
            try {
               var12 = var4.rFm.get(var1);
            } catch (Exception var9) {
               assert false : var9;
               var12 = null;
            }

            if (!var13) {
               var4.rFm.setAccessible(false);
            }

            lna$a var14 = (lna$a)var4.kza;
            var5 = var12 == null ? null : var14.aq(var12);
         } else if (!(var4.kza instanceof lnc$a)) {
            if (var4.kza instanceof lms) {
               lms var11 = (lms)var4.kza;
               var5 = var11.ap(var1);
            } else {
               var5 = var4.kza.euX();
            }
         } else {
            boolean var7 = var4.rFm.isAccessible();
            if (!var7) {
               var4.rFm.setAccessible(true);
            }

            Object var6;
            try {
               var6 = var4.rFm.get(var1);
            } catch (Exception var10) {
               assert false : var10;
               var6 = null;
            }

            if (!var7) {
               var4.rFm.setAccessible(false);
            }

            lnc$a var8 = (lnc$a)var4.kza;
            var5 = var6 == null ? null : var8.au(var6);
         }

         var2.add(var5);
      }

      return var2;
   }

   @Override
   protected Object evw() {
      assert this.rFk != null;

      try {
         return this.rFk.newInstance();
      } catch (Exception var2) {
         assert false;
         return null;
      }
   }

   @Override
   protected final lmz ar(Object var1) {
      assert this.rFk != null;
      return new lna(this, var1);
   }

   @Override
   protected List<lmw$a$a> evi() {
      return this.rFb;
   }

   private static final List<lna$a$a> b(Class<?> var0, lmt var1) {
      ArrayList var2 = new ArrayList();

      while (var0 != null) {
         for (Field var6 : var0.getDeclaredFields()) {
            if (!Modifier.isStatic(var6.getModifiers())) {
               lmu var7 = a(var6, var1);
               var2.add(new lna$a$a(var7, var6));
            }
         }

         var0 = var0.getSuperclass();
      }

      return var2;
   }

   public static lmu a(Field var0, lmt var1) {
      Class var2 = var0.getType();
      if (var2 == boolean.class) {
         return new lng$a(var0);
      } else if (var2 == double.class) {
         return new lnk$a(var0);
      } else if (var2 == float.class) {
         return new lns$a(var0);
      } else if (var2 == int.class) {
         return new lnw$a(var0);
      } else if (var2 == long.class) {
         return new loa$a(var0);
      } else if (var2 == String.class) {
         return new lof$a(var0);
      } else {
         return Enum.class.isAssignableFrom(var2) ? new lno$a(var0) : lmz$a.a(var2, var1);
      }
   }

   @Override
   protected String ccJ() {
      return this.rFk.getSimpleName();
   }
}
