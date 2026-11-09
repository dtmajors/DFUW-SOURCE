final class hnk$a implements lbn, lbp {
   public final hnj kOT;
   public final ldd kOU;
   public final boolean kOV;

   public hnk$a(hnk var1, hnj var2, ldd var3, boolean var4) {
      this.kOS = var1;
      this.kOT = var2;
      this.kOU = var3;
      this.kOV = var4;
   }

   @Override
   public final void W() {
      if (this.kOS.csB() != 0) {
         int var1 = this.kOS.csw();
         if (var1 == -1) {
            var1 = 0;
         } else {
            var1 = hnk.a(this.kOS).a(ldb.rep, this.kOU, this.kOT, var1);
         }

         this.kOS.P(var1, this.kOV);
      }
   }

   @Override
   public final boolean caU() {
      this.W();
      return true;
   }
}
