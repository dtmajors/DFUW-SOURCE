class jbp$5 extends iur {
   jbp$5(jbp var1) {
      this.mOV = var1;
   }

   @Override
   public void cLq() {
      cu.b var1 = cu.c.a(jbp.c(this.mOV), jbp.e(this.mOV), null);
      if (var1 != cu.b.kX) {
         jbp.c(this.mOV, var1.toString());
      } else {
         hzr var2 = new hzr();
         var2.oq("SFYesNoDialogSelentine");
         var2.pu(false);
         var2.setVisible(true);
         var2.setGUID(jbp.g(this.mOV).bzv());
         var2.G(lxz.tCd.bD(10).exA(), lxz.tBM.bD().exA());
         var2.a(new jbp$5$1(this));
         jbp.j(this.mOV).a(var2);
      }
   }
}
