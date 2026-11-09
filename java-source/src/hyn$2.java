class hyn$2 extends lie {
   hyn$2(hyn var1, double var2, boolean var4, int var5, int var6, String var7) {
      super(var2, var4);
      this.loY = var1;
      this.loZ = var5;
      this.lpa = var6;
      this.lpb = var7;
   }

   @Override
   public void dh(double var1) {
      if (hyn.r(this.loY)) {
         this.loY.o(this.loZ, this.lpa, this.lpb);
      }
   }
}
