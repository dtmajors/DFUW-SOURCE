class iej$6 extends ieh {
   iej$6(iej var1, ioa var2, joa var3, int var4) {
      super(var2, var3, var4);
      this.lNJ = var1;
   }

   @Override
   public void Qd(int var1) {
      if (var1 != iej.d(this.lNJ)) {
         iej.a(this.lNJ, var1);
         iej.f(this.lNJ).setText(iej.e(this.lNJ));
         iej.b(this.lNJ).o(lwl.teD.bD(var1));
         iej.g(this.lNJ).hX(true);
         this.lNJ.cPB();
      }
   }

   @Override
   public void cGR() {
      super.cGR();
      iej.b(this.lNJ).hX(false);
   }
}
