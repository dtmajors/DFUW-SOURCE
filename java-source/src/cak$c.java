import java.util.Map;

public enum cak$c {
   efD,
   efE,
   efF,
   efG,
   efH,
   efI,
   efJ,
   efK,
   efL,
   efM,
   efN,
   efO,
   efP,
   efQ,
   efR,
   efS,
   efT,
   efU,
   efV,
   efW,
   efX,
   efY,
   efZ,
   ega,
   egb,
   egc,
   egd,
   ege,
   egf,
   egg,
   egh,
   egi,
   egj,
   egk,
   egl,
   egm,
   egn,
   ego,
   egp,
   egq,
   egr,
   egs,
   egt;

   public static cak$c[] egu = new cak$c[]{efG, efH, efI, efJ, efK, efL, efM, efN, efP, efQ, efR, efV, efW, efY};
   public static cak$c[] egv = new cak$c[]{efG, efI, efJ, efL, efV};
   private static cak$c[] egw = new cak$c[]{efG, efI, efJ, efK, efL, efM, efP, efV, efW, efY, egs};
   private static cak$c[] egx = new cak$c[]{efN, efQ, efR};
   private static cak$c[] egy = new cak$c[values().length + 10];

   public static cak$c chooseRandomArmorLayer(Map<cak$c, brw> var0) {
      if (var0.isEmpty()) {
         return null;
      }

      for (int var1 = 0; var1 < egy.length; var1++) {
         egy[var1] = null;
      }

      int var5 = 0;

      for (int var2 = 0; var2 < egw.length; var2++) {
         brw var3 = (brw)var0.get(egw[var2]);
         if (var3 != null && var3.dJd != null) {
            for (int var4 = 0; var4 < var3.dJd.length; var4++) {
               if (var3.dJd[var4].dJe != null && !cug.wv(var3.dJd[var4].dJe.az())) {
                  egy[var5] = egw[var2];
                  var5++;
                  break;
               }
            }
         }
      }

      if (var5 == 0) {
         return null;
      }

      var5 += egv.length;
      if (var5 > egw.length) {
         var5 = egw.length;
      }

      int var7 = (int)(lgp.erA().nextFloat() * var5);
      assert var7 < egy.length;
      return egy[var7];
   }

   public static cak$c chooseRandomNonArmorLayer(Map<cak$c, brw> var0) {
      if (var0.isEmpty()) {
         return null;
      }

      if (!lgp.erA().cS(0.2F)) {
         return null;
      }

      int var1 = 0;

      for (int var2 = 0; var2 < egx.length; var2++) {
         if (var0.containsKey(egx[var2])) {
            egy[var1] = egx[var2];
            var1++;
         }
      }

      if (var1 == 0) {
         return null;
      }

      int var3 = (int)(lgp.erA().nextFloat() * var1);
      assert var3 < egy.length;
      return egy[var3];
   }

   public static boolean containsVisuallyAttachedApparels(cak$c var0) {
      if (var0 == null) {
         lfn.b(5, "LayerTypes", "containsVisuallyAttachedApparels() Invalid LayerType provided: " + var0);
         return false;
      }

      switch (var0) {
         case efG:
         case efH:
         case efI:
         case efJ:
         case efK:
         case efL:
         case efM:
         case egs:
         case efP:
         case efV:
         case efW:
         case efY:
         case egt:
         case egm:
         case egn:
            return true;
         default:
            return false;
      }
   }

   public static String findLayerName(int var0) {
      cak$c[] var1 = values();
      if (var0 >= 0 && var0 < var1.length) {
         return var1[var0].name();
      }

      lfn.b(5, "LayerTypes", "findLayerName() LayerType is invalid.");
      return null;
   }

   public static cak$c findLayerType(String var0) {
      cak$c[] var1 = values();
      int var2 = 0;

      for (int var3 = var1.length; var2 < var3; var2++) {
         if (var1[var2].name().equalsIgnoreCase(var0)) {
            return var1[var2];
         }
      }

      return null;
   }

   public static int findLayerType_int(String var0) {
      cak$c[] var1 = values();
      int var2 = 0;

      for (int var3 = var1.length; var2 < var3; var2++) {
         if (var1[var2].name().equalsIgnoreCase(var0)) {
            return var1[var2].ordinal();
         }
      }

      return -1;
   }

   public static String[] getAttachPointNames(cak$c var0) {
      if (var0 == null) {
         lfn.b(5, "LayerTypes", "getAttachPointNames() LayerType is null.");
         return null;
      }

      switch (var0) {
         case efG:
            return new String[]{"AttachPoint_Left Armpad", "AttachPoint_Right Armpad"};
         case efH:
            return new String[]{"AttachPoint_Cape"};
         case efI:
            return new String[]{"AttachPoint_Left Elbow", "AttachPoint_Right Elbow"};
         case efJ:
            return new String[]{"AttachPoint_Left Girdle", "AttachPoint_Middle Girdle", "AttachPoint_Right Girdle"};
         case efK:
            return new String[]{"AttachPoint_Left Glove", "AttachPoint_Right Glove"};
         case efL:
            return new String[]{"AttachPoint_Left Greave", "AttachPoint_Right Greave"};
         case efM:
            return new String[]{"AttachPoint_Hair", "AttachPoint_Helmet"};
         case egs:
            return new String[]{"AttachPoint_Helmet"};
         case efP:
            return new String[]{"AttachPoint_PantsArmor"};
         case efV:
            return new String[]{"AttachPoint_Left Shoe", "AttachPoint_Right Shoe"};
         case efW:
            return new String[]{"AttachPoint_Left Shoulderpad", "AttachPoint_Right Shoulderpad"};
         case efY:
            return new String[]{"AttachPoint_Torso"};
         case egt:
         case egm:
         case egn:
         default:
            lfn.b(5, "LayerTypes", "getAttachPointNames() Unknown layertype provided: " + var0);
            return null;
         case efE:
            return new String[0];
         case efF:
            return new String[]{"AttachPoint_Shield"};
         case efN:
            return new String[]{"AttachPoint_Necklace"};
         case efQ:
            return new String[0];
         case efR:
            return new String[0];
         case efT:
            return new String[]{"AttachPoint_Shield"};
         case efZ:
            return new String[]{"AttachPoint_Weapon", "AttachPoint_Weapon Left"};
      }
   }

   public static int getLayerCount() {
      return values().length;
   }

   public static String getLayerName(int var0) {
      String var1 = findLayerName(var0);
      assert var1 != null : "Invalid layer type: " + var0;
      return var1;
   }

   public static String[] getLayerNames() {
      cak$c[] var0 = values();
      String[] var1 = new String[var0.length];
      int var2 = 0;

      for (int var3 = var1.length; var2 < var3; var2++) {
         var1[var2] = var0[var2].name();
      }

      return var1;
   }

   public static cak$c getLayerType(int var0) {
      cak$c[] var1 = values();
      if (var0 >= 0 && var0 < var1.length) {
         return var1[var0];
      }

      lfn.b(5, "LayerTypes", "getLayerType() Ordinal is invalid.");
      return null;
   }

   public static int getLayerType(String var0) {
      int var1 = findLayerType_int(var0);
      assert var1 < 0 : "Invalid layer name: '" + var0 + "'";
      return var1;
   }

   public static boolean isIncompatibleWithRobeLayer(cak$c var0) {
      for (int var1 = 0; var1 < egv.length; var1++) {
         if (egv[var1] == var0) {
            return true;
         }
      }

      return false;
   }

   public static boolean isHairLayer(cak$c var0) {
      switch (var0) {
         case egs:
         case egb:
         case egc:
         case egf:
         case egg:
         case egj:
            return true;
         case efP:
         case efV:
         case efW:
         case efY:
         case egt:
         case egm:
         case egn:
         case efE:
         case efF:
         case efN:
         case efQ:
         case efR:
         case efT:
         case efZ:
         default:
            return false;
      }
   }

   public static boolean isArmorTypePermittedForMixing(cjv var0, cjv var1) {
      switch (var0) {
         case HEAVY:
         case MEDIUM:
            switch (var1) {
               case HEAVY:
               case MEDIUM:
                  return true;
               default:
                  return false;
            }
         case LIGHT_C:
         case LIGHT_M:
            switch (var1) {
               case LIGHT_C:
               case LIGHT_M:
                  return true;
               default:
                  return false;
            }
         default:
            return true;
      }
   }
}
