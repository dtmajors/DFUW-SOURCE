class iyu$a extends izr<T> {
   public iyu$a(iyu var1, ioa var2, joa var3) {
      super(var2, var3, iyu.a(var1)[iyu.b(var1)], iyu.c(var1), iyu.a(var1), "SortingPopUpWindowBackgroundBitmap", 40, 1, 215, 85);
      this.mCF = var1;
   }

   @Override
   public void a(Enum var1, boolean var2) {
      iyu.a(this.mCF, var1, var2);
   }

   @Override
   public void cGR() {
      dxr var1 = this.dhC().getMessageDelegator();
      super.cGR();
      iyu.a(this.mCF, var1);
   }
}
