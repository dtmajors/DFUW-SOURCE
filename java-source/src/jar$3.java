class jar$3 extends iok {
   jar$3(jar var1, String var2, String var3, String var4, String var5) {
      super(var2, var3, var4, var5);
      this.mKW = var1;
   }

   @Override
   public void cLq() {
      if (ioa.cxP().cyZ().abF() >= ls.pz()) {
         assert false : "Player can not be an apprentice";
      } else {
         gkt var1 = (gkt)jar.d(this.mKW).h(31491, jar.c(this.mKW), hso.cxK().bAn().Tr);
         var1.ed = 9;
         var1.YN = hso.cxK().bAn().Tr;
         var1.YL = "";
         jar.e(this.mKW).F(var1);
      }
   }

   @Override
   public hyn dd(int var1, int var2) {
      return iae.oJ(lxk.tsd.bD().exA());
   }
}
