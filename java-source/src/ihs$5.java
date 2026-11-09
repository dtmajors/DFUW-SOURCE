class ihs$5 extends izv {
   ihs$5(ihs var1, ire var2) {
      super(var2);
      this.lWV = var1;
   }

   @Override
   public boolean dK(int var1, int var2) {
      super.dK(var1, var2);
      ihs.a(this.lWV);
      return true;
   }

   @Override
   public boolean dL(int var1, int var2) {
      super.dL(var1, var2);
      this.lWV.b(hxv.llh);
      return true;
   }

   @Override
   public boolean du(int var1, int var2) {
      super.du(var1, var2);
      ihs.a(this.lWV);
      ihs.d(this.lWV, ioa.cxP().bpb(), ioa.cxP().bpc());
      return true;
   }

   @Override
   public boolean dM(int var1, int var2) {
      super.dM(var1, var2);
      if (this.dma()) {
         ihs.e(this.lWV, ioa.cxP().bpb(), ioa.cxP().bpc());
      }

      return true;
   }

   @Override
   public boolean dN(int var1, int var2) {
      super.dN(var1, var2);
      this.lWV.b(hxv.llh);
      ihs.f(this.lWV, ioa.cxP().bpb(), ioa.cxP().bpc());
      return true;
   }
}
