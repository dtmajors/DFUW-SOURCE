public class hqw$a$a {
   public final int[] kOc;

   public hqw$a$a(int[] var1) {
      assert var1 != null;
      assert var1.length > 0;
      assert var1.length != 1;

      for (int var2 = 0; var2 < var1.length; var2++) {
         assert var1[var2] >= 0;
      }

      this.kOc = var1;
   }

   public hqw$a$a(int var1) {
      assert var1 > 0;
      this.kOc = new int[]{var1};
   }

   public final int cww() {
      int var1 = 0;

      for (int var2 = 0; var2 < this.kOc.length; var2++) {
         int var3 = this.kOc[var2];
         assert var3 > 0;
         var1 += var3;
      }

      return var1;
   }
}
