import hoz.a;

class hdo$a extends hdo$b<bdr> {
   private final hki kaz;
   private final hdm jLM;
   private final ldv dbT;
   private final a[] kaA;
   private final lbn kaB = new hdo$a$1(this);

   public hdo$a(hdm var1, ldv var2, int var3, lip[] var4, String var5, lip var6, lip var7) {
      assert var2 != null;
      this.jLM = var1;
      this.dbT = var2;
      this.kaA = new a[var4.length];

      for (int var8 = 0; var8 < this.kaA.length; var8++) {
         this.kaA[var8] = new a(var4[var8]);
      }

      this.kaz = new hki(this.jLM, var5, var6, var7, this.kaA, this.kaA[var3], this.kaB);
      this.kaz.cdk();
   }

   @Override
   protected void cbg() {
      this.kaz.ne(false);
   }
}
