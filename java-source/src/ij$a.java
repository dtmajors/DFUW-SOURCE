public class ij$a {
   public final ldv adA;
   public ldv Tr;
   public final boolean afE;
   public ldv afF;
   private final gj[] WX;

   ij$a(ij var1, ldv var2, ldv var3, gj[] var4) {
      this.afG = var1;
      this.afF = null;
      this.adA = var2;
      if (var3 == null) {
         this.afE = true;
      } else {
         this.afE = false;
      }

      this.Tr = var3;
      this.WX = var4;
   }

   @Override
   public String toString() {
      return "[GUID=" + this.adA + ", PSOGUID=" + this.Tr + ", AINode=" + this.afE + " POGUID=" + this.afF + "]";
   }
}
