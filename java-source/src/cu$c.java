import java.util.Collection;

public class cu$c {
   public static final int lo = 3;
   public static final int lp = 2;
   public static final int lq = 4;
   public static final boolean lr = true;
   public static final boolean ls = true;

   public static int cv() {
      return 12;
   }

   public static int cw() {
      return 12;
   }

   public static cu$b a(String var0, String var1, Collection<cu$a> var2) {
      int var3 = var0 == null ? 0 : cu.O(var0);
      if (var0 == null || var3 < 3) {
         return cu$b.kY;
      }

      if (var3 > cv()) {
         return cu$b.kZ;
      }

      int var4 = var1 == null ? 0 : cu.O(var1);
      if (var1 == null || var4 < 2) {
         return cu$b.la;
      }

      if (var4 > cw()) {
         return cu$b.lb;
      }

      if (!lcw.emW()) {
         String var5 = var0.substring(0, 1);
         if (!var5.equals(var5.toUpperCase())) {
            return cu$b.lc;
         }

         var5 = var1.substring(0, 1);
         if (!var5.equals(var5.toUpperCase())) {
            return cu$b.ld;
         }
      }

      for (int var9 = 0; var9 < var0.length(); var9++) {
         char var6 = var0.charAt(var9);
         if (lcw.bcB == 1) {
            if ((var6 < 'a' || var6 > 'z') && (var6 < 'A' || var6 > 'Z')) {
               return cu$b.le;
            }
         } else if (!Character.isLetter(var6)) {
            return cu$b.le;
         }
      }

      for (int var10 = 0; var10 < var1.length(); var10++) {
         char var13 = var1.charAt(var10);
         if (lcw.bcB == 1) {
            if ((var13 < 'a' || var13 > 'z') && (var13 < 'A' || var13 > 'Z')) {
               return cu$b.lf;
            }
         } else if (!Character.isLetter(var13)) {
            return cu$b.lf;
         }
      }

      int var11 = 0;

      for (int var14 = 0; var14 < var0.length(); var14++) {
         char var7 = var0.charAt(var14);
         if (var7 != 'I' && var7 != 'l' && var7 != 'i') {
            var11 = 0;
         } else if (++var11 > 4) {
            return cu$b.lg;
         }
      }

      var11 = 0;

      for (int var15 = 0; var15 < var1.length(); var15++) {
         char var17 = var1.charAt(var15);
         if (var17 != 'I' && var17 != 'l' && var17 != 'i') {
            var11 = 0;
         } else if (++var11 > 4) {
            return cu$b.lh;
         }
      }

      if (var2 != null) {
         for (cu$a var18 : var2) {
            if (var18.d(var0, null)) {
               return cu$b.li;
            }

            if (var18.d(null, var1)) {
               return cu$b.lj;
            }
         }
      }

      return cu$b.kX;
   }
}
