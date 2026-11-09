class izp$3 extends ixk {
   izp$3(izp var1, int var2, int var3, ire var4, itg[] var5) {
      super(var2, var3, var4);
      this.mDu = var1;
      this.mDw = var5;
   }

   @Override
   public void Rb(int var1) {
      this.mDw[0].setText(var1 + "");
      izp.a(this.mDu, izp.a(this.mDu) >> 16 & 0xFF, var1, izp.a(this.mDu) & 0xFF);
   }
}
