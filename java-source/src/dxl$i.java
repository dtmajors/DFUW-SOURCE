import dxl.1;
import java.util.ArrayList;

public enum dxl$i {
   hou,
   hov,
   how,
   hox,
   hoy,
   hoz,
   hoA,
   hoB,
   hoC,
   hoD,
   hoE,
   hoF;

   private static final dxl$i[] hoG = dxl$i.class.getEnumConstants();

   public static final int getValueCount() {
      return hoG.length;
   }

   public static boolean isValidOrdinal(int var0) {
      return var0 >= 0 && var0 < getValueCount();
   }

   public static final dxl$i getValueByOrdinal(int var0) {
      return isValidOrdinal(var0) ? hoG[var0] : hoF;
   }

   public boolean isDefault() {
      return this == hoF;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String getName() {
      switch (1.hnu[this.ordinal()]) {
         case 1:
            return "Binds";
         case 2:
            return "Proximity";
         case 3:
            return "Connections";
         case 4:
            return "Politics";
         case 5:
            return "Ranks";
         case 6:
            return "Structures";
         case 7:
            return "Resources";
         case 8:
            return "WorkStations";
         case 9:
            return "Members";
         case 10:
            return "Misc";
         case 11:
            return "Control Points";
         case 12:
            return "Fortresses";
         default:
            return "Misc";
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String bEi() {
      switch (1.hnu[this.ordinal()]) {
         case 1:
            return "Changes to binds on clanstones.";
         case 2:
            return "People entering/leaving the towns and hamlets.";
         case 3:
            return " logins/logouts.";
         case 4:
            return "Political changes.";
         case 5:
            return "Changes to ranks within the clan.";
         case 6:
            return "New buildings/buildings damaged.";
         case 7:
            return "Harvesting of resources in towns/hamlets.";
         case 8:
            return "Use of crafting stations in hamlets.";
         case 9:
            return "New members joining/members leaving the clan.";
         case 10:
            return "Every other event not listed here.";
         case 11:
            return "Control points related events.";
         case 12:
            return "Fortresses related events.";
         default:
            return "Every other event not listed here.";
      }
   }

   public static int[] getDefaultValues() {
      int[] var0 = new int[hoG.length - 1];

      for (int var1 = 0; var1 < hoG.length; var1++) {
         if (hoG[var1] != hoF) {
            var0[var1] = hoG[var1].ordinal();
         }
      }

      return var0;
   }

   public static String getDefaultList(int[] var0) {
      ArrayList var1 = lcn.emv();

      for (int var2 = 0; var2 < var0.length; var2++) {
         if (getValueByOrdinal(var0[var2]) != hoF) {
            var1.add(getValueByOrdinal(var0[var2]));
         }
      }

      StringBuffer var4 = new StringBuffer();
      if (!var1.isEmpty()) {
         for (int var3 = 0; var3 < var1.size(); var3++) {
            var4.append(((dxl$i)var1.get(var3)).bEj());
            if (var3 + 1 < var1.size()) {
               var4.append(",");
            }
         }
      }

      return " And EventType In (" + var4.toString() + ") ";
   }

   public static String getEventsList(dxl$i[] var0) {
      if (var0 != null && var0.length != 0) {
         StringBuffer var1 = new StringBuffer();

         for (dxl$i var5 : var0) {
            var1.append(var5.bEj() + ",");
         }

         if (var1.toString().endsWith(",")) {
            var1 = new StringBuffer(var1.substring(0, var1.lastIndexOf(",")));
         }

         return " And EventType In (" + var1.toString() + ")";
      } else {
         return "";
      }
   }

   public String bEj() {
      switch (this) {
         default:
            return "";
      }
   }
}
