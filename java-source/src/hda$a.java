class hda$a implements lbn {
   lnh jKc;
   hpe jHH;
   lfb jHI;

   public hda$a(hda var1, lnh var2, hpe var3, lfb var4) {
      this.jKb = var1;
      this.jKc = var2;
      this.jHH = var3;
      this.jHI = var4;
      this.jKc.cec().a(true, this);
   }

   public void unregister() {
      this.jKc.cec().a(false, this);
   }

   @Override
   public void W() {
      this.jHH.mV(this.jHI.a(new liy((float)this.jKc.getValue())).esy());
   }
}
