class jda$4 extends iva {
   jda$4(jda var1, isf var2, int var3, int var4, loz var5, int var6, int var7, boolean var8, jbx var9) {
      super(var2, var3, var4, var5, var6, var7, var8);
      this.mSG = var1;
      this.mSH = var9;
   }

   @Override
   public void pn(boolean var1) {
      if (var1) {
         jda.a(this.mSG).mQq.add(this.mSH);
      } else {
         jda.a(this.mSG).mQq.remove(this.mSH);
      }
   }
}
