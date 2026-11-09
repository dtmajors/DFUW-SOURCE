class hcv$2 implements lbn {
   hcv$2(hcv var1) {
      this.jJC = var1;
   }

   @Override
   public final void W() {
      double var1 = hcv.a(this.jJC).ccW().getValue();
      var1 = Math.max(var1, hcv.a(this.jJC).ccX().getValue());
      hcv.a(this.jJC).ccW().es(var1);
      double var3 = hcv.a(this.jJC).ccY().getValue();
      var3 = Math.min(hcv.a(this.jJC).ccX().getValue(), var3);
      hcv.a(this.jJC).ccY().es(var3);
   }
}
