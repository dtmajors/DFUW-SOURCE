class jde$11 extends jdc {
   jde$11(jde var1, jci var2, jci var3) {
      super(var2);
      this.mSR = var1;
      this.mSU = var3;
   }

   @Override
   public boolean du(int var1, int var2) {
      jde.b(this.mSR).a(this.mSU);
      jcc.dwT().c(this.mSU);
      return false;
   }
}
