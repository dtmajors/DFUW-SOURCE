final class inv$1 extends inv {
   inv$1(loz var1, int var2, int var3, int var4, int var5, hyr var6, hyn var7) {
      super(var1, var2, var3, var4, var5);
      this.lyF = var6;
      this.mnm = var7;
   }

   @Override
   public void oH(boolean var1) {
      this.lyF.oH(var1);
      if (this.mnm != null) {
         this.mnm.cFc();
      }
   }
}
