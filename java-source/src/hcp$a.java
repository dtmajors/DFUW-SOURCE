class hcp$a implements lbn {
   lnt jHG;
   hpe jHH;
   lfb jHI;

   public hcp$a(hcp var1, lnt var2, hpe var3, lfb var4) {
      this.jHJ = var1;
      this.jHG = var2;
      this.jHH = var3;
      this.jHI = var4;
      this.jHG.cec().a(true, this);
   }

   public void unregister() {
      this.jHG.cec().a(false, this);
   }

   @Override
   public void W() {
      this.jHH.mV(this.jHI.a(new lja(this.jHG.getValue())).esy());
   }
}
