class iet$4 extends hze {
   iet$4(iet var1) {
      this.lPm = var1;
   }

   @Override
   public void c(joa var1) {
      joa var2 = a(var1, iet.b(this.lPm).cEI(), 3, 2);
      if (var2.Y > var1.Y) {
         iet.b(this.lPm).ty(true);
         iet.b(this.lPm).de((int)var2.X, (int)var2.Y - 32);
      } else {
         iet.b(this.lPm).ty(false);
         iet.b(this.lPm).de((int)var2.X, (int)var2.Y + 16);
      }
   }

   @Override
   public void close() {
      iet.b(this.lPm).close();
      hso.cxK().cxO().getMessageDelegator().hd(iet.b(this.lPm).getGUID());
   }
}
