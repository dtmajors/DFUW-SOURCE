class izp$6 extends itg {
   izp$6(izp var1, String var2, int var3, int var4, int var5, int var6, itg[] var7, ixk[] var8) {
      super(var2, var3, var4, var5, var6);
      this.mDu = var1;
      this.mDy = var7;
      this.mDz = var8;
   }

   @Override
   public void od(String var1) {
      int var2 = Integer.valueOf(var1);
      if (var2 > 255) {
         var2 = 255;
         this.mDy[0].setText("255");
      }

      this.mDz[0].setValue(var2);
      izp.a(this.mDu, izp.a(this.mDu) >> 16 & 0xFF, izp.a(this.mDu) >> 8 & 0xFF, var2);
   }
}
