class jiz$1 extends hze {
   jiz$1(jiz var1) {
      this.nhP = var1;
   }

   @Override
   public void c(joa var1) {
      joa var2 = a(var1, jiz.a(this.nhP).cEI(), 3, 2);
      jiz.a(this.nhP).de((int)var2.X, (int)var2.Y);
   }

   @Override
   public void close() {
      jiz.a(this.nhP).close();
      hso.cxK().cxO().getMessageDelegator().hd(jiz.a(this.nhP).getGUID());
   }
}
