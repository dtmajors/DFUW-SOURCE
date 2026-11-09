class jqx$8 implements lbi<jrm> {
   jqx$8(jqx var1) {
      this.nTG = var1;
   }

   public final void b(jrm var1) {
      jqj var2 = (jqj)jqx.a(this.nTG).get(var1.dRs());
      if (var1.getErrorCode() != 0) {
         assert false;
      } else {
         assert var2 != null : var1.dRs();
         assert var2 instanceof jqk;
         int var3 = var1.dRE();
         switch (var3) {
            case 0:
            case 1:
            case 2:
            case 3:
               assert false;
               break;
            case 4:
            case 5:
            case 6:
               ((jqk)var2).J(var1.dRz(), var1.getValue(), var1.dRF(), var1.dRA());
               break;
            case 7:
               assert false;
         }
      }
   }
}
