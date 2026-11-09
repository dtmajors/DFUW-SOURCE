public class hqy$a {
   public final hqw$a kZC;
   public final hpe.c kiK;
   public final int kZR;
   public final int kZS;
   public final int kZT;
   public final int kZU;
   public final lhf kZD;

   public hqy$a(hqw$a var1, hpe.c var2, int var3, int var4, int var5, int var6, lhf var7) {
      assert var1 != null;
      assert var2 != null;
      assert var7 != null;
      this.kZC = var1;
      this.kiK = var2;
      this.kZR = var3;
      this.kZS = var4;
      this.kZT = var5;
      this.kZU = var6;
      this.kZD = var7;
   }

   public lhf cwv() {
      return this.kZC.cwv();
   }

   public lhf h(lhf var1) {
      return new lhf(this.kZR + var1.rmN + this.kZT, this.kZS + var1.H + this.kZU);
   }
}
