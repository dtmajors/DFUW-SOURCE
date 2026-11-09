public enum byw$b {
   ebc,
   ebd,
   ebe,
   ebf,
   ebg,
   ebh,
   ebi,
   ebj,
   ebk,
   ebl,
   ebm,
   ebn,
   ebo,
   ebp,
   ebq,
   ebr,
   ebs,
   ebt,
   ebu,
   ebv,
   ebw,
   ebx,
   eby,
   ebz,
   ebA,
   ebB,
   ebC,
   ebD,
   ebE,
   ebF,
   ebG,
   ebH,
   ebI,
   ebJ,
   ebK,
   ebL,
   ebM,
   ebN,
   ebO,
   ebP;

   public static byw$b getMountedControllerType(int var0, int var1, boolean var2, boolean var3) {
      if (var2) {
         switch (var1) {
            case 1:
            case 3:
               return var0 == cug.fpb ? ebJ : ebC;
            case 2:
               return var0 == cug.fpb ? ebG : ebz;
            default:
               lfn.b(5, "ControllerTypes", "getMountedControllerType(Mounted Water) Invalid weaponmode found: '" + var1 + "'");
               return var0 == cug.fpb ? ebJ : ebC;
         }
      } else {
         switch (var1) {
            case 1:
            case 3:
               if (var3) {
                  return var0 == cug.fpb ? ebI : ebB;
               }

               return var0 == cug.fpb ? ebH : ebA;
            case 2:
               if (var3) {
                  return var0 == cug.fpb ? ebF : eby;
               }

               return var0 == cug.fpb ? ebE : ebx;
            default:
               lfn.b(5, "ControllerTypes", "getMountedControllerType(Mounted Land) Invalid weaponmode found: '" + var1 + "'");
               return var0 == cug.fpb ? ebI : ebB;
         }
      }
   }
}
