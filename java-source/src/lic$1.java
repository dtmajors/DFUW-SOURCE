class lic$1 implements lbn {
   lic$1(lic var1) {
      this.roh = var1;
   }

   @Override
   public final void W() {
      double var1 = this.roh.kAz.emb();

      while (lic.a(this.roh).size() != 0) {
         lib var3 = lic.b(this.roh);
         double var4 = var3.esf();
         if (var4 >= var1) {
            break;
         }

         var3.esh();
         if (var3.isStarted() && var3.esf() <= var4) {
            var3.stop();
         }
      }
   }
}
