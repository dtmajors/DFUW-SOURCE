class jda$2 extends iva {
   jda$2(
      jda var1,
      isf var2,
      int var3,
      int var4,
      loz var5,
      int var6,
      int var7,
      String var8,
      String var9,
      String var10,
      String var11,
      String var12,
      String var13,
      String var14,
      String var15,
      jbx var16
   ) {
      super(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15);
      this.mSG = var1;
      this.mSH = var16;
   }

   @Override
   public void pn(boolean var1) {
      if (var1) {
         jda.a(this.mSG).mQq.add(this.mSH);
      } else {
         jda.a(this.mSG).mQq.remove(this.mSH);
      }
   }

   @Override
   public hyn dd(int var1, int var2) {
      return iae.oJ(this.mSH.mQg.bD().exA().toUpperCase());
   }
}
