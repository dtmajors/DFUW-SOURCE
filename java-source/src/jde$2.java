class jde$2 extends jdb {
   jde$2(jde var1, jch var2, jch var3) {
      super(var2);
      this.mSR = var1;
      this.mPT = var3;
   }

   @Override
   public boolean du(int var1, int var2) {
      jcc.dwT().c(this.mPT);
      return false;
   }
}
