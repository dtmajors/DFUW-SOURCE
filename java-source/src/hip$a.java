class hip$a implements hmi {
   public final String Title;
   public hpt kvC;
   hgv kvD;
   bqt[] kpm;

   hip$a(hip var1, String var2) {
      this.kvE = var1;
      this.Title = var2;
   }

   @Override
   public String cgO() {
      return this.Title;
   }

   @Override
   public hms a(lgg var1, lhf var2) {
      this.kvC = new hpt(this.kvE.kLu, "", var1, var2, this.kvE.dXw.kJW);
      this.kvD = new hgv(this.kvE.kLu, "Tab " + this.Title, lgg.rlI, var2, this.kvE.dXw.kKl);
      this.kvC.cqd().a(this.kvD);
      this.kvD.b(this.kpm);
      return this.kvC;
   }

   void b(bqt[] var1) {
      this.kpm = var1;
      if (this.kvD != null) {
         this.kvD.b(this.kpm);
      }
   }
}
