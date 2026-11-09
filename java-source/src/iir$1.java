class iir$1 extends ipg<Boolean> {
   iir$1(iir var1, ipf var2, String var3, hsu var4, boolean var5) {
      super(var2, var3, var4, var5);
      this.mbE = var1;
   }

   public Boolean dQ(int var1, int var2) {
      return Boolean.FALSE;
   }

   @Override
   public void dak() {
      this.mbE.daj();
   }
}
