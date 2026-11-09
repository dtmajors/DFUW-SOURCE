class hda$c implements lbn {
   lnt jHG;
   hpe jHH;
   lfb jHI;

   public hda$c(hda var1, lnt var2, hpe var3, lfb var4) {
      this.jKb = var1;
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
