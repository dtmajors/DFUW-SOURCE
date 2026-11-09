import java.util.Map;

@llc
public enum bqm$d {
   AXE,
   BOW,
   CLUB,
   GREATAXE,
   GREATCLUB,
   GREATSWORD,
   KNIVES,
   MAGIC_STAFF,
   NATURAL_BOW,
   NATURAL_MAGIC_STAFF,
   NATURAL_MELEE,
   POLEARM,
   SIEGE_WEAPON,
   SITHRA,
   SWORD,
   THROWABLE_WEAPON,
   TOOL;

   private static Map<Integer, bqm$d> WeaponTypeCache = lcn.emw();

   public static bqm$d getWeaponType(int var0) {
      if (var0 <= 0) {
         lfn.b(5, "WeaponTypes", "getWeaponType() ResourceType is invalid.");
         return null;
      }

      bqm$d var1 = WeaponTypeCache.get(var0);
      if (var1 != null) {
         return var1;
      }

      if (bqm.auF().isDescendant(var0, cug.fiu)) {
         var1 = BOW;
      } else if (bqm.auF().isDescendant(var0, cug.fiB)) {
         var1 = MAGIC_STAFF;
      } else if (bqm.auF().isDescendant(var0, cug.fiC)) {
         if (bqm.auF().isDescendant(var0, cug.fit)) {
            var1 = AXE;
         } else if (bqm.auF().isDescendant(var0, cug.fiv)) {
            var1 = CLUB;
         } else if (bqm.auF().isDescendant(var0, cug.fiw)) {
            var1 = GREATAXE;
         } else if (bqm.auF().isDescendant(var0, cug.fix)) {
            var1 = GREATCLUB;
         } else if (bqm.auF().isDescendant(var0, cug.fiy)) {
            var1 = GREATSWORD;
         } else if (bqm.auF().isDescendant(var0, cug.fiA)) {
            var1 = KNIVES;
         } else if (bqm.auF().isDescendant(var0, cug.fiH)) {
            var1 = POLEARM;
         } else if (bqm.auF().isDescendant(var0, cug.fiM)) {
            var1 = SIEGE_WEAPON;
         } else if (bqm.auF().isDescendant(var0, cug.fiI)) {
            var1 = SITHRA;
         } else if (bqm.auF().isDescendant(var0, cug.fiJ)) {
            var1 = SWORD;
         }
      } else if (bqm.auF().isDescendant(var0, cug.fiG)) {
         if (bqm.auF().isDescendant(var0, cug.fiF)) {
            var1 = NATURAL_BOW;
         } else if (bqm.auF().isDescendant(var0, cug.fiD)) {
            var1 = NATURAL_MAGIC_STAFF;
         } else if (bqm.auF().isDescendant(var0, cug.fiE)) {
            var1 = NATURAL_MELEE;
         }
      } else if (bqm.auF().isDescendant(var0, cug.fiK)) {
         var1 = THROWABLE_WEAPON;
      } else if (bqm.auF().isDescendant(var0, cug.fmO)) {
         var1 = TOOL;
      }

      if (var1 == null) {
         lfn.b(5, "WeaponTypes", "getWeaponType() Resource '" + bqm.auF().getName(var0) + "' is not a weapon.");
         return null;
      } else {
         WeaponTypeCache.put(var0, var1);
         return var1;
      }
   }

   public static boolean isAllowedWhileMounted(bqm$d var0) {
      if (var0 == null) {
         lfn.b(5, "WeaponTypes", "isAllowedWhileMounted() WeaponType is null.");
         return false;
      }

      switch (var0) {
         case AXE:
         case CLUB:
         case SITHRA:
         case SWORD:
            return true;
         default:
            return false;
      }
   }

   public static boolean isMeleeWeapon(bqm$d var0) {
      if (var0 == null) {
         lfn.b(5, "WeaponTypes", "isMeleeWeapon() WeaponType is null.");
         return false;
      }

      switch (var0) {
         case AXE:
         case CLUB:
         case SITHRA:
         case SWORD:
         case GREATAXE:
         case GREATCLUB:
         case GREATSWORD:
         case KNIVES:
         case NATURAL_MELEE:
         case POLEARM:
         case SIEGE_WEAPON:
            return true;
         default:
            return false;
      }
   }

   public static boolean isNaturalWeapon(bqm$d var0) {
      if (var0 == null) {
         lfn.b(5, "WeaponTypes", "isNaturalWeapon() WeaponType is null.");
         return false;
      }

      switch (var0) {
         case NATURAL_MELEE:
         case NATURAL_BOW:
         case NATURAL_MAGIC_STAFF:
            return true;
         case POLEARM:
         case SIEGE_WEAPON:
         default:
            return false;
      }
   }

   public static boolean isOneHandedWeapon(bqm$d var0) {
      if (var0 == null) {
         lfn.b(5, "WeaponTypes", "isOneHandedWeapon() WeaponType is null.");
         return false;
      }

      switch (var0) {
         case AXE:
         case CLUB:
         case SITHRA:
         case SWORD:
         case THROWABLE_WEAPON:
         case TOOL:
            return true;
         case GREATAXE:
         case GREATCLUB:
         case GREATSWORD:
         case KNIVES:
         case NATURAL_MELEE:
         case POLEARM:
         case SIEGE_WEAPON:
         case NATURAL_BOW:
         case NATURAL_MAGIC_STAFF:
         default:
            return false;
      }
   }

   public static boolean isTwoHandedWeapon(bqm$d var0) {
      if (var0 == null) {
         lfn.b(5, "WeaponTypes", "isTwoHandedWeapon() WeaponType is null.");
         return false;
      }

      switch (var0) {
         case GREATAXE:
         case GREATCLUB:
         case GREATSWORD:
         case KNIVES:
         case POLEARM:
         case SIEGE_WEAPON:
            return true;
         case NATURAL_MELEE:
         default:
            return false;
      }
   }

   public static boolean isWeaponWithAmmunition(bqm$d var0) {
      if (var0 == null) {
         lfn.b(5, "WeaponTypes", "isWeaponWithAmmunition() WeaponType is null.");
         return false;
      }

      switch (var0) {
         case NATURAL_BOW:
            return true;
         default:
            return false;
      }
   }
}
