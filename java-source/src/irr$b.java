class irr$b implements hvr {
   private double oV;
   private double mvw;
   private float mvx;

   private irr$b(irr var1) {
      this.mvv = var1;
      this.mvx = 0.0F;
   }

   @Override
   public void az(ldz var1) {
      this.oV = var1.rgz;
      this.mvw = this.oV;
      this.mvx = irr.j(this.mvv);
      this.mvv.setProgress(0.0F);
   }

   @Override
   public void aA(ldz var1) {
      this.mvv.setProgress(this.mvx);
   }

   @Override
   public void doTick(ldz var1) {
      double var2 = var1.rgz - this.oV;
      this.mvv.setProgress((float)(this.mvx * var2 / irr.c(this.mvv).doh()));
      if (var2 >= irr.c(this.mvv).doh()) {
         this.mvv.dnN();
      }
   }
}
