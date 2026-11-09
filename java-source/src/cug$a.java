import java.util.List;

public enum cug$a {
   fxn,
   fxo,
   fxp,
   fxq,
   fxr,
   fxs,
   fxt,
   fxu,
   fxv,
   fxw,
   fxx;

   public static int getMonsterCategoryFromHealth(int var0) {
      if (var0 < 0) {
         return fxn.ordinal();
      } else if (var0 < 60) {
         return fxo.ordinal();
      } else if (var0 < 105) {
         return fxp.ordinal();
      } else if (var0 < 175) {
         return fxq.ordinal();
      } else if (var0 < 285) {
         return fxr.ordinal();
      } else if (var0 < 440) {
         return fxs.ordinal();
      } else if (var0 < 665) {
         return fxt.ordinal();
      } else if (var0 < 1000) {
         return fxu.ordinal();
      } else if (var0 < 3100) {
         return fxv.ordinal();
      } else {
         return var0 < 30000 ? fxw.ordinal() : fxx.ordinal();
      }
   }

   public static int getGoldRewardPieces(int var0, int var1) {
      int var2 = 1;
      float var3 = 0.0F;
      ler var4 = cug.Ht().acv(var0);
      boolean var5 = cug.Ht().e(var4);
      if (var5) {
         var3 = cug.uM(var0);
         var2 = getMonsterCategoryFromHealth((int)var3);
      } else {
         int var6 = 0;
         List var7 = cug.Ht().a(var4, true);

         for (ler var9 : var7) {
            var6 += (int)cug.uM(var9.getType());
         }

         int var10 = var7.size();
         if (var6 != 0) {
            if (var10 > 0) {
               var3 = var6 / var7.size();
            }

            var2 = getMonsterCategoryFromHealth((int)var3);
         }
      }

      return var2 > 0 && var1 > 0 ? (int)var3 / (var2 * 20) * var1 : 0;
   }
}
