class lia$1 implements lbn {
   lia$1(lia var1) {
      this.rod = var1;
   }

   @Override
   public final void W() {
      assert lia.a(this.rod).isStarted();
      this.rod.cxd();
      double var1 = lia.a(this.rod).esb();
      if (var1 > lia.b(this.rod)) {
         this.rod.stop();
         this.rod.ese();
      }
   }
}
