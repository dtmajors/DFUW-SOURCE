class izp$1 extends ixk {
   izp$1(izp var1, int var2, int var3, ire var4, itg[] var5) {
      super(var2, var3, var4);
      this.mDu = var1;
      this.mDt = var5;
   }

   @Override
   public void Rb(int var1) {
      this.mDt[0].setText(var1 + "");
      izp.a(this.mDu, var1, izp.a(this.mDu) >> 8 & 0xFF, izp.a(this.mDu) & 0xFF);
   }
}
