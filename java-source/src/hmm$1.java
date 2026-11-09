class hmm$1 implements hme {
   hmm$1(hmm var1) {
      this.kLs = var1;
   }

   @Override
   public final lbl<lbn> cpY() {
      return hmm.a(this.kLs).kiG.chy();
   }

   @Override
   public final double cpZ() {
      return hmm.b(this.kLs);
   }

   @Override
   public final double cqa() {
      return hmm.c(this.kLs);
   }

   @Override
   public final double cqb() {
      return hmm.d(this.kLs);
   }

   @Override
   public final boolean cP(double var1) {
      if (var1 < hmm.c(this.kLs)) {
         var1 = hmm.c(this.kLs);
      }

      if (var1 > hmm.d(this.kLs)) {
         var1 = hmm.d(this.kLs);
      }

      if (var1 == hmm.b(this.kLs)) {
         return false;
      }

      hmm.a(this.kLs, var1);
      hmm.e(this.kLs);
      return true;
   }

   @Override
   public boolean chD() {
      return hmm.a(this.kLs).kiG.chD();
   }
}
