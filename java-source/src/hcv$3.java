class hcv$3 implements lbn {
   hcv$3(hcv var1) {
      this.jJC = var1;
   }

   @Override
   public final void W() {
      double var1 = hcv.a(this.jJC).ccX().getValue();
      var1 = Math.max(hcv.a(this.jJC).ccY().getValue(), var1);
      hcv.a(this.jJC).ccX().es(var1);
      double var3 = hcv.a(this.jJC).ccW().getValue();
      var3 = Math.max(var3, hcv.a(this.jJC).ccX().getValue());
      hcv.a(this.jJC).ccW().es(var3);
   }
}
