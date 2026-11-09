class jqx$9 implements lbi<jrn> {
   jqx$9(jqx var1) {
      this.nTG = var1;
   }

   public final void b(jrn var1) {
      jqj var2 = (jqj)jqx.a(this.nTG).get(var1.dRs());
      if (var1.getErrorCode() != 0) {
         assert false;
      } else if (var2 == null) {
         lfn.b(
            5,
            "SFInputSystem.MessageHandlerInputEventMessageResponse.new IConsumer<SFInputEventMessageInputResponse>() {...}",
            "consume: Device is null - ignoring " + var1
         );
      } else {
         assert var2 != null : var1.dRs();
         assert var2 instanceof jqo;
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
               assert false;
               break;
            case 7:
               ((jqo)var2).b(var1.dRC(), var1.dRD(), var1.dRB(), var1.getX(), var1.getY(), var1.dRF());
         }
      }
   }
}
