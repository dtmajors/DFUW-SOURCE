class hbm$b implements lbn {
   public int iTt;
   private hpx jCx;
   private boolean jCy;

   hbm$b(hbm var1, int var2) {
      this.jCv = var1;
      this.jCx = null;
      this.iTt = var2;
   }

   @Override
   public final void W() {
      if (this.jCy) {
         this.jCx.og(true);
      }

      if (this.iTt != 0) {
         hbm.a(this.jCv, this.iTt);
      }
   }

   public void a(hpx var1) {
      this.jCx = var1;
   }
}
