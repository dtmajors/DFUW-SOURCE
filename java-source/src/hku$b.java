public class hku$b implements lbs<hku> {
   public final hdm jLM;

   public hku$b(hdm var1) {
      this.jLM = var1;
   }

   public hku b(lfu var1, hku var2) {
      bqm.b var3 = var1.b("Type", var2 == null ? bqm.b.dEm : var2.kCo);
      if (var3 == bqm.b.dEm) {
         return null;
      }

      if (var1.eqA()) {
         var2 = new hku(this.jLM, var3);
      } else {
         assert var2 != null;
      }

      var1.a("Factory", var2);
      return var2;
   }
}
