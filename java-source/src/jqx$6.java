class jqx$6 implements lbi<jrs> {
   jqx$6(jqx var1) {
      this.nTG = var1;
   }

   public final void b(jrs var1) {
      jqj var2 = (jqj)jqx.a(this.nTG).get(var1.dRs());
      if (var1.getErrorCode() != 0) {
         assert false;
      } else {
         var2.e(var1.dRv(), var1.dRw(), var1.dRu());
      }
   }
}
