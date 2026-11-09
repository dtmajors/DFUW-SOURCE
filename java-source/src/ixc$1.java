class ixc$1 extends ixm {
   ixc$1(ixc var1) {
      this.mBc = var1;
   }

   @Override
   public void Sw(int var1) {
      this.mBc.Sj(var1);
   }

   @Override
   public void Rb(int var1) {
      if (this.mBc.dnz()) {
         this.mBc.Sg(var1);
      }
   }

   @Override
   public void Sx(int var1) {
      if (!this.mBc.dnz()) {
         this.mBc.Sg(var1);
      }

      this.mBc.Sl(var1);
   }
}
