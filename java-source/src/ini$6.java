class ini$6 extends izz {
   ini$6(ini var1) {
      this.mmm = var1;
   }

   @Override
   public void od(String var1) {
      super.od(var1);
      int var2 = Integer.valueOf(var1);
      if (var2 != ini.a(this.mmm).mjl) {
         ini.a(this.mmm).mjl = var2;
         ini.a(this.mmm).mjt = !var1.isEmpty() && ini.a(this.mmm).mjl <= ini.a(this.mmm).mjm;
         ini.g(this.mmm).hX(ini.a(this.mmm).mjt);
      }
   }
}
