import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum alc$a {
   brl(null, null),
   brm(alc$b.brG, alc$c.brL),
   brn(alc$b.brG, alc$c.brI),
   bro(alc$b.brG, alc$c.brJ),
   brp(alc$b.brG, alc$c.brK),
   brq(alc$b.brE, alc$c.brL),
   brr(alc$b.brE, alc$c.brI),
   brs(alc$b.brE, alc$c.brJ),
   brt(alc$b.brE, alc$c.brK),
   bru(alc$b.brF, alc$c.brL),
   brv(alc$b.brF, alc$c.brI),
   brw(alc$b.brF, alc$c.brJ),
   brx(alc$b.brF, alc$c.brK);

   public final alc$b bry;
   public final alc$c brz;
   public static final List<alc$a> ListOfValue = Collections.unmodifiableList(Arrays.asList(alc$a.class.getEnumConstants()));

   alc$a(alc$b var3, alc$c var4) {
      this.bry = var3;
      this.brz = var4;
   }

   public static alc$a getValueByEnchantmentTypeAndSlotType(alc$b var0, alc$c var1) {
      alc$a[] var2 = alc$a.class.getEnumConstants();
      int var3 = 0;

      for (int var4 = var2.length; var3 < var4; var3++) {
         if (var2[var3].bry == var0 && var2[var3].brz == var1) {
            return var2[var3];
         }
      }

      assert false : "EnchantmentType=" + var0 + ", SlotType=" + var1;
      return null;
   }

   public static alc$a getEnchantmentSlotType(int var0) {
      alc$a[] var1 = alc$a.class.getEnumConstants();
      if (var0 >= 0 && var0 < var1.length) {
         return var1[var0];
      }

      lfn.b(5, "EnchantmentSlotTypes", "getEnchantmentSlotType() Ordinal is invalid.");
      return null;
   }

   public static final boolean isRareIngredient(alc$a var0) {
      switch (var0) {
         case brm:
         case brq:
         case bru:
            return true;
         default:
            return false;
      }
   }
}
