class hnc$2 implements lbn {
   hnc$2(hnc var1) {
      this.kNR = var1;
   }

   @Override
   public final void W() {
      assert hnc.a(this.kNR);

      while (hnc.c(this.kNR).size() > 0) {
         ldl var1 = (ldl)hnc.c(this.kNR).remove(0);
         var1.enp();
      }

      if (hnc.d(this.kNR)) {
         hnc.a(this.kNR, false);
         if (hnc.b(this.kNR) == null) {
            this.kNR.cdD();
         }
      }
   }
}
