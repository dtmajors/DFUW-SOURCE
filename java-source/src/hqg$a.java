final class hqg$a {
   public final int kTt;
   public final int kYp;
   public final int kYq;
   public final int kYr;
   public final boolean kYs;
   public final int kYt;
   public final int kYu;

   public hqg$a(hqg var1, int var2, int var3, int var4, int var5) {
      this.kYv = var1;
      assert var2 >= 0;
      assert var3 >= 0;
      assert var4 >= 0;
      assert var5 >= 0;
      this.kTt = var2;
      this.kYp = Math.min(var3, this.kTt / 2);
      assert this.kYp >= 0 && this.kYp <= var3;
      this.kYq = Math.min(var4, this.kTt / 2);
      assert this.kYq >= 0 && this.kYq <= var4;
      int var6 = this.kTt;
      var6 -= this.kYp;
      var6 -= this.kYq;
      this.kYu = var6;
      assert this.kYu >= 0 && this.kYu <= this.kTt;
      double var7 = (double)this.kTt / hqg.a(var1);
      if (var7 > 1.0) {
         var7 = 1.0;
      }

      int var9 = (int)(this.kYu * var7);
      assert var9 >= 0 && var9 <= this.kYu;
      if (var9 < var5) {
         var9 = var5;
      }

      this.kYr = var9;
      boolean var12 = true;
      int var8 = this.kYu - this.kYr;
      if (var8 <= 0) {
         var8 = 0;
         var12 = false;
      }

      this.kYs = var12;
      this.kYt = var8;
   }

   public int NR(int var1) {
      assert var1 >= 0;
      assert var1 <= this.kYt;
      int var2 = var1 * hqg.a(this.kYv) / this.kYu;
      assert var2 >= 0;
      assert var2 == 0 && hqg.a(this.kYv) == 0 || var2 < hqg.a(this.kYv);
      return var2;
   }

   public int NS(int var1) {
      assert var1 >= 0;
      if ((var1 != 0 || hqg.a(this.kYv) != 0) && var1 >= hqg.a(this.kYv)) {
         var1 = hqg.a(this.kYv);
      }

      if (var1 == 0) {
         return 0;
      }

      int var2 = var1 * this.kYu / hqg.a(this.kYv);
      if (var2 < this.kYt) {
         var2++;
      } else if (var2 > this.kYt) {
         var2 = this.kYt;
      }

      assert var2 >= 0;
      assert var2 <= this.kYt;
      return var2;
   }
}
