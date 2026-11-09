class jju$7 extends lie {
   jju$7(jju var1, double var2, boolean var4, double var5, double var7) {
      super(var2, var4);
      this.nrc = var1;
      this.lNI = var5;
      this.nrp = var7;
   }

   @Override
   public void dh(double var1) {
      double var3 = this.lNI - this.MessageDelegator.arc().rgz;
      if (var3 >= 0.0) {
         double var5 = var3 / this.nrp;
         this.nrc.a("setTeleportationDebuffProgress", new Object[]{var5});
      } else {
         jju.g(this.nrc);
      }
   }
}
