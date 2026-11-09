class hkr$6 implements lbn {
   hkr$6(hkr var1) {
      this.kCn = var1;
   }

   @Override
   public final void W() {
      if (!hkr.a(this.kCn).isConstructed() || !hkr.a(this.kCn).isActive()) {
         this.kCn.j(null);
         if (this.kCn.cdi()) {
            this.kCn.closeWindow();
         }
      }

      hkr.a(this.kCn).cfe();
   }
}
