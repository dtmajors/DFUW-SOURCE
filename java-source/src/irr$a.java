class irr$a implements hvr {
   private irr$a(irr var1) {
      this.mvv = var1;
   }

   @Override
   public void az(ldz var1) {
   }

   @Override
   public void aA(ldz var1) {
   }

   @Override
   public void doTick(ldz var1) {
      this.mvv.doTick(var1);
      if (irr.h(this.mvv).isEmpty()) {
         irr.i(this.mvv);
      }
   }
}
