public class hoq$a<ROW> extends hop$a<ROW, String, hpa, hpe> {
   public final hoq<ROW> kSY;

   public hoq$a(hoq<ROW> var1) {
      super(var1, var1.kSP);
      this.kSY = var1;
   }

   @Override
   public void c(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      super.c(var1, var2, var3, var4, var5, var6, var7, var8);
      lhu var9 = this.NF(var3);
      this.kST.a(var9);
      this.kST.H(this.kSU);
   }

   @Override
   public void b(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      super.b(var1, var2, var3, var4, var5, var6, var7, var8);
      hoq$c var9 = this.kSY.kSW.get(var4);
      hpe$c var10 = var9.kiK;
      this.kSn.a(var10);
      lcq var11 = this.kSU.V(var9.kfb);
      this.kSn.H(var11);
      this.kSn.mV(this.kSf == null ? "null" : this.kSf);
   }

   @Override
   protected lcq b(ROW var1, int var2) {
      lcq var3 = lcq.COLORSHIFT_NEUTRAL;
      if (this.kSY.isRowSelected(var2)) {
         var3 = var3.V(this.kSY.kSV.kTb);
      }

      if (this.kSY.NA(var2)) {
         var3 = var3.V(this.kSY.kSV.kTc);
      }

      if (this.kSY.g(var2, (ROW)var1)) {
         var3 = var3.V(this.kSY.kSV.kTd);
      }

      return var3;
   }

   protected lhu NF(int var1) {
      return this.kSY.isRowSelected(var1) ? this.kSY.kSV.kTf : this.kSY.kSV.kTe;
   }
}
