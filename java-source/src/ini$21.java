class ini$21 extends izz {
   ini$21(ini var1) {
      this.mmm = var1;
   }

   @Override
   public void od(String var1) {
      super.od(var1);
      int var2 = Integer.valueOf(var1);
      if (var2 != ini.a(this.mmm).mji) {
         ini.a(this.mmm).mji = var2;
         ini.a(this.mmm).mjr = !var1.isEmpty() && ini.a(this.mmm).mjh <= ini.a(this.mmm).mji;
         ini.e(this.mmm).hX(ini.a(this.mmm).mjr);
      }
   }
}
