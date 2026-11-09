public class hpq$b<NODE> extends hpm$a<NODE, String, hps<NODE, String, hpe>, hpe> {
   private final hpq<NODE> kWc;

   public hpq$b(hpq<NODE> var1) {
      super(var1);
      this.kWc = var1;
   }

   @Override
   public void c(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      super.c(var1, var2, var3, var4, var5, var6, var7, var8);
      lhu var9 = this.kWc.jHT.Nr(var3) ? hpq.a(this.kWc).kVP : lhu.rnR;
      this.kST.kgb.a(var9);
      lcq var10 = lcq.COLORSHIFT_NEUTRAL;
      if (this.kWc.cvj() == this.kSS) {
         var10 = var10.V(hpq.a(this.kWc).kVQ);
      }

      this.kST.kgb.H(var10);
   }

   @Override
   public void b(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      super.b(var1, var2, var3, var4, var5, var6, var7, var8);
      this.kSn.mV(this.kSf == null ? "null" : this.kSf);
      lcq var9 = this.a(this.kSS, this.kSf, var3, var4, lcq.COLORSHIFT_NEUTRAL);
      this.kSn.H(var9);
   }

   protected lcq a(NODE var1, String var2, int var3, int var4, lcq var5) {
      assert lda.by(var1, var2, new Integer(var3 + var4));
      return var5;
   }
}
