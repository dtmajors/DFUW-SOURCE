class hns$5 implements lbp {
   hns$5(hns var1) {
      this.kPE = var1;
   }

   @Override
   public final boolean caU() {
      assert hns.a(this.kPE);
      if (!hns.c(this.kPE).chj().chz().equals(hns.d(this.kPE))) {
         hns.b(this.kPE, hns.e(this.kPE).size());
         hns.c(this.kPE, true);
         hns.c(this.kPE).chj().mN(hns.d(this.kPE));
         hns.c(this.kPE).chj().setCaretPosition(hns.d(this.kPE).length());
         hns.c(this.kPE, false);
         return true;
      } else {
         return false;
      }
   }
}
