class hmz$2 implements lbn {
   hmz$2(hmz var1) {
      this.kMO = var1;
   }

   @Override
   public final void W() {
      if (hmz.a(this.kMO) != hmz$a.kMQ) {
         if (hmz.b(this.kMO) != null && !hmz.b(this.kMO).isInitialized()) {
            hmz.c(this.kMO);
            assert hmz.b(this.kMO) == null || hmz.b(this.kMO).isInitialized();
         }
      }
   }
}
