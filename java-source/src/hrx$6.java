class hrx$6 implements lbn {
   hrx$6(hrx var1) {
      this.laO = var1;
   }

   @Override
   public final void W() {
      if (hrx.a(this.laO) != 0) {
         mig var1 = mig.n(hrx.b(this.laO).rng);
         var1.aer(hrx.a(this.laO));
         if ((hrx.a(this.laO) & 1) != 0) {
            var1.yX(hrx.c(this.laO));
         }

         if ((hrx.a(this.laO) & 4) != 0) {
            var1.aes(hrx.d(this.laO));
         }

         if ((hrx.a(this.laO) & 2) != 0) {
            var1.yY(hrx.e(this.laO));
         }

         hrx.b(this.laO).rnh.m(var1);
         hrx.a(this.laO, 0);
      }
   }
}
