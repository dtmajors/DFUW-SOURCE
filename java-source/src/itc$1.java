class itc$1 extends ism {
   itc$1(itc var1, isf var2, int var3, int var4, String var5, String var6) {
      super(var2, var3, var4, var5);
      this.myC = var1;
      this.myB = var6;
   }

   @Override
   public boolean du(int var1, int var2) {
      this.myC.qE(this.myB);
      return true;
   }

   @Override
   public void cND() {
      super.cND();
      this.Rk(this.dkb() ? 12632256 : 11250603);
   }
}
