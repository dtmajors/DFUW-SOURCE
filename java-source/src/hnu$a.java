public class hnu$a implements hnz$c {
   private lgs kPS;

   public hnu$a(hnu var1) {
      this.kPR = var1;
   }

   @Override
   public void ctb() {
      this.kPR.csZ();
   }

   @Override
   public boolean a(hnz$a var1) {
      assert lda.by(var1);
      assert this.kPS == null;
      this.kPS = this.kPR.cqD();
      hnu.a(this.kPR).enp();
      return true;
   }

   @Override
   public void b(hnz$a var1) {
      assert this.kPS != null;
      boolean var2 = var1.c(hnz$a.kQv);
      boolean var3 = var1.c(hnz$a.kQw);
      boolean var4 = var1.c(hnz$a.kQy);
      boolean var5 = var1.c(hnz$a.kQx);
      lgs var6 = hnu.b(this.kPS, this.kPR.kLu.cse(), this.kPR.cqt().cqv(), var2, var3, var4, var5);
      lhf var7 = var6.cqv();
      var7 = this.kPR.b(var7);
      var6 = hnu.b(var6, var7, var2, var3, var4, var5);
      this.kPR.j(var6);
   }

   @Override
   public void ctc() {
      assert this.kPS != null;
      this.kPS = null;
      hnu.a(this.kPR).enp();
   }

   @Override
   public boolean csS() {
      return this.kPS != null;
   }

   @Override
   public void ctd() {
      this.kPR.cfM();
   }
}
