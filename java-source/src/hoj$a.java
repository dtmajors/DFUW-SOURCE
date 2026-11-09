public class hoj$a<CELL_COMPONENT extends hms> {
   public final hoj<CELL_COMPONENT> kSm;
   protected CELL_COMPONENT kSn;

   public hoj$a(hoj<CELL_COMPONENT> var1) {
      this.kSm = var1;
   }

   public void i(int var1, int var2, int var3, int var4) {
      int var5 = this.kSm.k(ldb.reo).Nl(var2);
      int var6 = this.kSm.k(ldb.rep).Nl(var1);
      int var7 = this.kSm.k(ldb.reo).cru();

      for (int var8 = var1; var8 <= var3; var8++) {
         int var9 = this.kSm.k(ldb.rep).Nk(var8);
         this.c(var1, var2, var8, var4, var5, var6, var7, var9);
         var6 += var9;
      }
   }

   public void c(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      for (int var9 = var2; var9 <= var4; var9++) {
         int var10 = this.kSm.k(ldb.reo).Nk(var9);
         this.b(var1, var2, var3, var9, var5, var6, var7, var8);
         var5 += var10;
      }
   }

   public void b(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      this.kSn = this.kSm.cK(var3 - var1, var4 - var2);
      if (this.kSn != null) {
         this.kSn.h(var5, var6, var7, var8);
      }
   }
}
