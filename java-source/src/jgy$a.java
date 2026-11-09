class jgy$a extends irr {
   int ayO;
   int aGF;
   lox bfV;

   public jgy$a(jgy var1, irs var2, lox var3, int var4, int var5) {
      super(var2);
      this.nbN = var1;
      this.aGF = var4;
      this.ayO = var5;
      this.bfV = var3;
   }

   public void setLimit(int var1) {
      this.ayO = var1;
   }

   public void UC(int var1) {
      this.aGF = var1;
   }

   public void i(lox var1) {
      this.bfV = var1;
   }

   @Override
   public hyn dd(int var1, int var2) {
      int var3 = 45;
      this.djE();
      int var4 = ioa.cxP().bpc();
      if (var4 < hso.cxK().cxY().H / 2.0F) {
         var3 = -var3;
      }

      iae var10000;
      if (this.bfV != null) {
         String var10002 = this.bfV.bD(this.aGF, this.ayO).exA();
         this.djE();
         var10000 = new iae(var10002, ioa.cxP().bpb(), var4 + var3);
      } else {
         var10000 = null;
      }

      return var10000;
   }
}
