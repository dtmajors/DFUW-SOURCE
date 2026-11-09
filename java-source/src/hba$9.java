class hba$9 implements lbd {
   private int jAB;

   hba$9(hba var1) {
      this.jAx = var1;
   }

   @Override
   public final ldv caL() {
      assert hba.b(this.jAx);
      ldv var1 = hba.e(this.jAx).bzv();
      assert var1 != null;
      assert var1.ib() == lcr.acL.ib() : var1;
      assert var1.enw() == lcr.acL.enw() : var1;
      this.jAB++;
      return var1;
   }

   @Override
   public final void qR(ldv var1) {
      assert hba.b(this.jAx);
      assert var1 != null;
      assert var1.ib() == lcr.acL.ib();
      assert var1.enw() == lcr.acL.enw();
      hba.e(this.jAx).tY(var1);
      assert !hba.e(this.jAx).tn(var1);
      this.jAB--;
   }

   @Override
   public final int caM() {
      assert hba.b(this.jAx);
      return this.jAB;
   }
}
