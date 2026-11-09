class iiy$3 extends lie {
   iiy$3(iiy var1, double var2, boolean var4, double var5, double var7) {
      super(var2, var4);
      this.mce = var1;
      this.mcf = var5;
      this.mcg = var7;
   }

   @Override
   public void dh(double var1) {
      if (var1 >= this.mcf && iiy.b(this.mce) == null) {
         iiy.c(this.mce);
      }

      if (iiy.d(this.mce) != null) {
         double var3 = this.mcg - this.mce.djE().getMessageDelegator().arc().rgz;
         if (var3 < 0.0) {
            var3 = 0.0;
         }

         iiy.d(this.mce).c(iae.os(lyu.tJU.bD(var3).exA()));
      }
   }
}
