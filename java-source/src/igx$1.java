class igx$1 extends ipx {
   igx$1(igx var1, iqz var2) {
      super(var2);
      this.lUG = var1;
   }

   @Override
   public boolean dx(int var1, int var2) {
      return !igx.a(this.lUG).isLocked() && !igx.a(this.lUG).isCompleted();
   }

   @Override
   public ifg dy(int var1, int var2) {
      return new ifh(igx.a(this.lUG).cTs(), -16, -16);
   }

   @Override
   public hyn dd(int var1, int var2) {
      hyn var3 = super.dd(var1, var2);
      return var3 != null ? var3 : (iae)null;
   }

   @Override
   public hyn dz(int var1, int var2) {
      return null;
   }
}
