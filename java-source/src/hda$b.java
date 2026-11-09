class hda$b implements lbn {
   lnp jKd;
   hpe jHH;
   lfb jHI;

   public hda$b(hda var1, lnp var2, hpe var3, lfb var4) {
      this.jKb = var1;
      this.jKd = var2;
      this.jHH = var3;
      this.jHI = var4;
      this.jKd.cec().a(true, this);
   }

   public void unregister() {
      this.jKd.cec().a(false, this);
   }

   @Override
   public void W() {
      this.jHH.mV(this.jHI.a(new liy(this.jKd.getValue())).esy());
   }
}
