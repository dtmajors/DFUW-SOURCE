class iht$a extends ipx {
   public iht$a(iht var1) {
      super(new iht$a$1(ire.muk, var1));
      this.lXl = var1;
   }

   @Override
   public boolean du(int var1, int var2) {
      if (super.du(var1, var2)) {
         return true;
      }

      this.rS(true);
      this.djE().b(hxv.llj);
      iht var10000 = this.lXl;
      this.djE();
      int var10001 = ioa.cxP().bpb();
      this.djE();
      var10000.dH(var10001, ioa.cxP().bpc());
      return true;
   }

   @Override
   public boolean dM(int var1, int var2) {
      if (!this.dma()) {
         if (super.dM(var1, var2)) {
            return true;
         }
      } else {
         iht var10000 = this.lXl;
         this.djE();
         int var10001 = ioa.cxP().bpb();
         this.djE();
         var10000.dI(var10001, ioa.cxP().bpc());
      }

      return true;
   }

   @Override
   public boolean dN(int var1, int var2) {
      if (super.dN(var1, var2)) {
         return true;
      }

      this.rS(false);
      this.djE().b(hxv.llh);
      iht var10000 = this.lXl;
      this.djE();
      int var10001 = ioa.cxP().bpb();
      this.djE();
      var10000.dJ(var10001, ioa.cxP().bpc());
      return true;
   }
}
