class ibp$15 extends ibn {
   ibp$15(ibp var1) {
      this.lGb = var1;
   }

   @Override
   public void PU(int var1) {
      ibp.a(this.lGb, var1);
   }

   @Override
   public void PV(int var1) {
      ibp.b(this.lGb, var1);
   }
}
