class ini$3 extends izz {
   ini$3(ini var1) {
      this.mmm = var1;
   }

   @Override
   public void od(String var1) {
      super.od(var1);
      int var2 = Integer.valueOf(var1);
      if (var2 != ini.a(this.mmm).mjj) {
         ini.a(this.mmm).mjj = var2;
         ini.a(this.mmm).mjs = !var1.isEmpty() && ini.a(this.mmm).mjj <= ini.a(this.mmm).mjk;
         ini.f(this.mmm).hX(ini.a(this.mmm).mjs);
      }
   }
}
