class jge$1 extends ipx {
   jge$1(jge var1, iqz var2) {
      super(var2);
      this.mZu = var1;
   }

   @Override
   public boolean du(int var1, int var2) {
      jge.a(this.mZu, true);
      jge.b(this.mZu);
      this.rS(true);
      return true;
   }

   @Override
   public boolean dN(int var1, int var2) {
      jge.a(this.mZu, false);
      jge.b(this.mZu);
      this.rS(false);
      if (this.dF(var1, var2)) {
         if (hso.cxK().cxP().cyZ().cAh() || hso.cxK().cxP().cyZ().czZ()) {
            return false;
         }

         this.mZu.b(jge$a.mZx, lea.epx().getDelay());
         this.djE();
         ioa.cxP().czx().czJ();
         this.mZu.dDQ();
      }

      return true;
   }

   @Override
   public void cND() {
      jge.b(this.mZu);
   }
}
