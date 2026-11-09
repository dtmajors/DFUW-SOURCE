class hie$2 implements lbi<jpk> {
   hie$2(hie var1) {
      this.kuV = var1;
   }

   public void a(jpk var1) {
      jox var2;
      if (var1 instanceof jpm) {
         var2 = this.kuV.a((jpm)var1);
      } else if (var1 instanceof jpl) {
         var2 = this.kuV.a((jpl)var1);
      } else {
         assert false : var1;
         var2 = null;
      }

      if (var2 != null) {
         hie.a(this.kuV, var2);
         hie.c(this.kuV);
      }
   }
}
