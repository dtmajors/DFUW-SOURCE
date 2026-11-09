class ieh$1 extends iow {
   ieh$1(ieh var1, ipf var2, ist var3, ipf var4, ist var5, ipf var6, ist var7, ipf var8, ist var9, int var10) {
      super(var2, var3, var4, var5, var6, var7, var8, var9);
      this.lNm = var1;
      this.lNl = var10;
   }

   @Override
   public void cLq() {
      ieh.a(this.lNm);
      this.lNm.Qd(this.lNl);
   }
}
