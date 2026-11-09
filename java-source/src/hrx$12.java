class hrx$12 implements lbi<miq> {
   hrx$12(hrx var1) {
      this.laO = var1;
   }

   public final void a(miq var1) {
      if (var1.getErrorCode() != 0) {
         assert false;
      } else {
         assert var1.dRw().equals(hrx.j(this.laO));
         hrx.b(this.laO, var1.getCursorType());
      }
   }
}
