class heo$a extends hnu {
   private final lhz kfa;
   private final lcq kfb;
   private final lbn kfc = new heo$a$1(this);
   private boolean Initialized;

   public heo$a(hnc var1, String var2, lgg var3, lhf var4, hnu.f var5, lcq var6) {
      super(var1, var2, var3, var4, var5);
      this.kfb = var6;
      this.kfa = new lhz(var1.kAz);
      hpe var7 = new hpe(var1, (String)null, lgg.rlI, lhf.rnv, ((hlv)var1).kIy, "");
      this.w(var7);
   }

   @Override
   protected void FF() {
      assert !this.Initialized;
      super.FF();
      this.Initialized = true;
      this.kfa.start();
      this.mU(true);
   }

   @Override
   protected void FG() {
      assert this.Initialized;
      this.mU(false);
      this.kfa.stop();
      super.FG();
      this.Initialized = false;
   }

   @Override
   protected boolean cfL() {
      return false;
   }

   private void mU(boolean var1) {
      this.kfa.eqf().a(var1, this.kfc);
   }
}
