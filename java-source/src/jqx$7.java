class jqx$7 implements lbi<jro> {
   jqx$7(jqx var1) {
      this.nTG = var1;
   }

   public final void b(jro var1) {
      jqj var2 = (jqj)jqx.a(this.nTG).get(var1.dRs());
      if (var1.getErrorCode() != 0) {
         assert false;
      } else {
         assert var2 != null : var1.dRs();
         int var3 = var1.dRE();
         switch (var3) {
            case 0:
            case 1:
            case 3:
               var2.aj(var1.dRw(), var3);
               break;
            case 2:
               jqx.a(this.nTG, true);
               var2.aj(var1.dRw(), var3);
               break;
            case 4:
            case 5:
            case 6:
               assert false;
               break;
            case 7:
               assert false;
         }
      }
   }
}
