class hrx$8 implements lbi<miy> {
   hrx$8(hrx var1) {
      this.laO = var1;
   }

   public final void a(miy var1) {
      if (var1.getErrorCode() != 0) {
         assert false;
      } else {
         switch (var1.dRv()) {
            case 0:
               hrx.a(this.laO, var1.dRw());
               return;
            case 1:
               assert false;
               return;
            case 2:
               assert false;
               return;
            default:
               assert false : var1.dRv();
         }
      }
   }
}
