class hza$1 extends iwl {
   hza$1(hza var1) {
      this.lvL = var1;
   }

   @Override
   public void pn(boolean var1) {
      this.lvL.pm(var1);
   }

   @Override
   public hyn dd(int var1, int var2) {
      if (hza.a(this.lvL) == null) {
         return null;
      }

      lhe var3 = new lhe();
      hza.a(this.lvL).T(var3);
      return (hyn)var3.rnu;
   }
}
