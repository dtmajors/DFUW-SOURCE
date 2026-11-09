class izp$2 extends itg {
   izp$2(izp var1, String var2, int var3, int var4, int var5, int var6, itg[] var7, ixk[] var8) {
      super(var2, var3, var4, var5, var6);
      this.mDu = var1;
      this.mDt = var7;
      this.mDv = var8;
   }

   @Override
   public void od(String var1) {
      int var2 = Integer.valueOf(var1);
      if (var2 > 255) {
         var2 = 255;
         this.mDt[0].setText("255");
      }

      this.mDv[0].setValue(var2);
      izp.a(this.mDu, var2, izp.a(this.mDu) >> 8 & 0xFF, izp.a(this.mDu) & 0xFF);
   }
}
