public class hop$a<ROW, CELL, ROW_COMPONENT extends hms, CELL_COMPONENT extends hms> extends hoi$a<CELL, CELL_COMPONENT> {
   public final hop<ROW, CELL, ROW_COMPONENT, CELL_COMPONENT> kOR;
   public final hrd<ROW, CELL> kSP;
   protected ROW kSS;
   protected ROW_COMPONENT kST;
   protected lcq kSU;

   public hop$a(hop<ROW, CELL, ROW_COMPONENT, CELL_COMPONENT> var1, hrd<ROW, CELL> var2) {
      super(var1, var1.kSb);
      this.kOR = var1;
      this.kSP = var2;
   }

   @Override
   public void c(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      this.kSS = this.kSP.LQ(var3);
      this.kST = this.kOR.kSR.get(var3 - var1);
      this.kSU = this.b(this.kSS, var3);
      this.kST.h(var5, var6, var7, var8);
      super.c(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   protected lcq b(ROW var1, int var2) {
      return lcq.COLORSHIFT_NEUTRAL;
   }
}
