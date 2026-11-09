class iyi$a extends hvl {
   public iyi$a(iyi var1) {
      super(1.0F, 0.25F, 0.5);
      this.mBN = var1;
   }

   @Override
   public void hz(float var1) {
      iya var2 = this.mBN.dsK();
      if (var2 != null) {
         var2.hz(var1);
      }

      iyd var3 = this.mBN.dsJ();
      if (var3 != null) {
         var3.hz(var1);
      }
   }

   @Override
   public void aA(ldz var1) {
      iya var2 = this.mBN.dsK();
      if (var2 != null) {
         var2.hz(1.0F);
      }

      iyd var3 = this.mBN.dsJ();
      if (var3 != null) {
         var3.hz(1.0F);
      }
   }
}
