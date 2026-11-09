class ijk$7 extends ipg<Boolean> {
   ijk$7(ijk var1, ipf var2, String var3, hsu var4, boolean var5) {
      super(var2, var3, var4, var5);
      this.mdw = var1;
   }

   public Boolean dQ(int var1, int var2) {
      return true;
   }

   @Override
   public void dak() {
      if (ijk.c(this.mdw) != null) {
         ijk.c(this.mdw).setVisible((Boolean)ijk.d(this.mdw).get());
      }
   }
}
