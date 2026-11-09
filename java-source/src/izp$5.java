class izp$5 extends ixk {
   izp$5(izp var1, int var2, int var3, ire var4, itg[] var5) {
      super(var2, var3, var4);
      this.mDu = var1;
      this.mDy = var5;
   }

   @Override
   public void Rb(int var1) {
      this.mDy[0].setText(var1 + "");
      izp.a(this.mDu, izp.a(this.mDu) >> 16 & 0xFF, izp.a(this.mDu) >> 8 & 0xFF, var1);
   }
}
