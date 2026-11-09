class hrx$11 implements lbi<mio> {
   hrx$11(hrx var1) {
      this.laO = var1;
   }

   public final void a(mio var1) {
      if (var1.getErrorCode() != 0) {
         assert false;
      } else {
         assert var1.dRw().equals(hrx.j(this.laO));
         hrx.a(this.laO, var1.ezj());
      }
   }
}
