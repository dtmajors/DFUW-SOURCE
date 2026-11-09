class jbw$3 implements jbb {
   public jbx mPS;

   jbw$3(jbw var1, jch var2) {
      this.mPR = var1;
      this.mPT = var2;
      this.mPS = this.mPT.dxe();
   }

   @Override
   public jba cVQ() {
      jct var1 = new jct(this.mPT, this.mPS);
      var1.setGUID(hso.cxK().cxP().cyJ().getMessageDelegator().bzv());
      hso.cxK().cxP().cyJ().getMessageDelegator().a(var1);
      return var1;
   }
}
