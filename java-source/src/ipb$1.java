class ipb$1 extends iqu {
   ipb$1(ipb var1, int var2, int var3) {
      super(var2, var3);
      this.mqh = var1;
   }

   @Override
   public void e(ipf var1) {
      if (this.mqh.djt() != null && !this.mqh.djt().isEmpty()) {
         super.e(var1);
      } else {
         this.setSize(0, 0);
      }
   }
}
