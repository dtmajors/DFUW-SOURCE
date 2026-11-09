class jgy$b extends ist {
   private final aex bgh;
   private int nbO;

   public jgy$b(jgy var1, isf var2, int var3, int var4, aex var5, int var6) {
      super(var2, var3, var4, var5.wp() != null ? var5.wp().bD() : lvn.sXN.bD("Empty"));
      this.nbN = var1;
      this.bgh = var5;
      this.nbO = var6;
   }

   private void UD(int var1) {
      this.nbO = var1;
   }

   @Override
   public hyn dd(int var1, int var2) {
      int var3 = 45;
      this.djE();
      int var4 = ioa.cxP().bpc();
      if (var4 < hso.cxK().cxY().H / 2.0F) {
         var3 = -var3;
      }

      String var10002 = this.bgh.zl().bD().exA();
      this.djE();
      return new iae(var10002, ioa.cxP().bpb(), var4 + var3);
   }
}
