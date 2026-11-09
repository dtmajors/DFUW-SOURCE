public class hoi$a<CELL, CELL_COMPONENT extends hms> extends hoj$a<CELL_COMPONENT> {
   public final hrr<CELL> kSe;
   protected CELL kSf;

   public hoi$a(hoj<CELL_COMPONENT> var1, hrr<CELL> var2) {
      super(var1);
      this.kSe = var2;
   }

   @Override
   public void b(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      this.kSf = this.kSe.cT(var3, var4);
      super.b(var1, var2, var3, var4, var5, var6, var7, var8);
   }
}
