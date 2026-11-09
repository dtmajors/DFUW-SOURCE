public class hpm$a<ROW, CELL, ROW_COMPONENT extends hpr<ROW, CELL, CELL_COMPONENT>, CELL_COMPONENT extends hms>
   extends hop$a<ROW, CELL, ROW_COMPONENT, CELL_COMPONENT> {
   public final hpm<ROW, CELL, ROW_COMPONENT, CELL_COMPONENT> kVI;
   protected int kVJ;

   public hpm$a(hpm<ROW, CELL, ROW_COMPONENT, CELL_COMPONENT> var1) {
      super(var1, var1.kVB);
      this.kVI = var1;
   }

   @Override
   public void c(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      this.kVJ = this.kVI.NO(var3);
      super.c(var1, var2, var3, var4, var5, var6, var7, var8);
      boolean var9 = this.kVI.kVB.H(this.kSS);
      boolean var10 = var9 ? this.kVI.kVB.I(this.kSS) : false;
      this.kST.a(this.kSS, this.kVJ, var9, var10);
   }

   @Override
   public void b(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (var4 == 0) {
         var5 += this.kVJ;
         var7 -= this.kVJ;
      }

      super.b(var1, var2, var3, var4, var5, var6, var7, var8);
      if (var4 == 0) {
         var5 -= this.kVJ;
         var7 += this.kVJ;
      }
   }
}
