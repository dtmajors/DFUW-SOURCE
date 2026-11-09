class hrx$13 implements lbi<mir> {
   hrx$13(hrx var1) {
      this.laO = var1;
   }

   public final void a(mir var1) {
      if (var1.getErrorCode() != 0) {
         assert false;
      } else {
         assert var1.dRw().equals(hrx.j(this.laO));
         hrx.b(this.laO, var1.ezl());
      }
   }
}
