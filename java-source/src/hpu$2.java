class hpu$2 implements lbn {
   hpu$2(hpu var1) {
      this.kWM = var1;
   }

   @Override
   public final void W() {
      assert hpu.a(this.kWM);
      hpu.b(this.kWM);
   }
}
