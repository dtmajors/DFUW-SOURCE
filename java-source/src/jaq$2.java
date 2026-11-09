class jaq$2 extends iok {
   jaq$2(jaq var1, String var2, String var3, String var4, String var5) {
      super(var2, var3, var4, var5);
      this.mKC = var1;
   }

   @Override
   public void cLq() {
      if (ioa.cxP().cyZ().abF() >= ls.pz()) {
         assert false : "Player can not be an apprentice";
      } else {
         gkt var1 = (gkt)jaq.f(this.mKC).h(31491, jaq.e(this.mKC), hso.cxK().bAn().Tr);
         var1.ed = 9;
         var1.YN = hso.cxK().bAn().Tr;
         var1.YL = "";
         jaq.g(this.mKC).F(var1);
      }
   }

   @Override
   public hyn dd(int var1, int var2) {
      return iae.oJ(lxk.tsd.bD().exA());
   }
}
