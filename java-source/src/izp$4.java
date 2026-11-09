class izp$4 extends itg {
   izp$4(izp var1, String var2, int var3, int var4, int var5, int var6, itg[] var7, ixk[] var8) {
      super(var2, var3, var4, var5, var6);
      this.mDu = var1;
      this.mDw = var7;
      this.mDx = var8;
   }

   @Override
   public void od(String var1) {
      int var2 = Integer.valueOf(var1);
      if (var2 > 255) {
         var2 = 255;
         this.mDw[0].setText("255");
      }

      this.mDx[0].setValue(var2);
      izp.a(this.mDu, izp.a(this.mDu) >> 16 & 0xFF, var2, izp.a(this.mDu) & 0xFF);
   }
}
