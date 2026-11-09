class hex$1 implements lbn {
   hex$1(hex var1) {
      this.kgc = var1;
   }

   @Override
   public final void W() {
      double var1 = hex.a(this.kgc).esb() * 4.0;
      boolean var3 = false;
      if (var1 > 1.0) {
         hex.a(this.kgc).reset();
         var1 = 1.0;
         var3 = true;
      }

      hex.b(this.kgc).H(new lcq(1.0F, 1.0F, 1.0F, (float)var1));
      if (var3) {
         hex.c(this.kgc);
      }
   }
}
