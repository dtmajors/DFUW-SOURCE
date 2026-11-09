import java.util.Comparator;

final class amt$1 implements Comparator<String> {
   public int compare(String var1, String var2) {
      if (var1.equals(var2)) {
         return 0;
      }

      char[] var3 = var1.toCharArray();
      char[] var4 = var2.toCharArray();
      int var5 = Math.max(var3.length, var4.length);
      StringBuffer var6 = new StringBuffer();
      StringBuffer var7 = new StringBuffer();
      StringBuffer var8 = new StringBuffer();
      StringBuffer var9 = new StringBuffer();
      StringBuffer var10 = new StringBuffer();
      StringBuffer var11 = new StringBuffer();

      for (int var12 = 0; var12 < var5; var12++) {
         char var13 = var12 >= var3.length ? '\uffff' : var3[var12];
         char var14 = var12 >= var4.length ? '\uffff' : var4[var12];
         if (Character.isDigit(var13)) {
            var10.append(var13);
         }

         if (Character.isDigit(var14)) {
            var11.append(var14);
         }

         if (var13 != var14) {
            if (var10.length() == 0) {
               var6.append(var13);
            } else {
               var8.append(var13);
            }

            if (var11.length() == 0) {
               var7.append(var14);
            } else {
               var9.append(var14);
            }
         }
      }

      if (var10.length() == 0 && var11.length() == 0) {
         return var1.hashCode() - var2.hashCode();
      }

      int var19 = var6.length();
      int var20 = var7.length();
      if (var19 != var20) {
         return var19 - var20;
      }

      int var21 = var6.toString().hashCode();
      int var15 = var7.toString().hashCode();
      if (var21 != var15) {
         return var21 - var15;
      }

      int var16 = var10.length() == 0 ? 0 : Integer.parseInt(var10.toString());
      int var17 = var11.length() == 0 ? 0 : Integer.parseInt(var11.toString());
      int var18 = var16 - var17;
      return var18 != 0 ? var18 : var8.toString().hashCode() - var9.toString().hashCode();
   }
}
