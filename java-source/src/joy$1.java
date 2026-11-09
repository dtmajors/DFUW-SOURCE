class joy$1 implements lbi<jpc> {
   joy$1(joy var1) {
      this.nKX = var1;
   }

   public void a(jpc var1) {
      if (var1 instanceof jpe) {
         joy.a(this.nKX, (jpe)var1);
      } else if (var1 instanceof jpd) {
         joy.a(this.nKX, (jpd)var1);
      } else {
         assert false;
      }
   }
}
